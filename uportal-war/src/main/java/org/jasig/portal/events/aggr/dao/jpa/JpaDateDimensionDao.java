/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.events.aggr.dao.jpa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.jasig.portal.events.aggr.DateDimension;
import org.jasig.portal.events.aggr.dao.DateDimensionDao;
import org.jasig.portal.jpa.BaseJpaDao;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Eric Dalquist
 * @version $Revision$
 */
@Repository
public class JpaDateDimensionDao extends BaseJpaDao implements DateDimensionDao {
    private static final String FIND_ALL_TIME_DIMENSIONS_CACHE_REGION = DateDimensionImpl.class.getName() + ".query.FIND_ALL_TIME_DIMENSIONS";
    private static final String FIND_TIME_DIMENSION_BY_HOUR_MINUTE_CACHE_REGION = DateDimensionImpl.class.getName() + ".query.FIND_TIME_DIMENSION_BY_HOUR_MINUTE";
    
    private CriteriaQuery<DateDimensionImpl> findAllDateDimensionsQuery;
    private CriteriaQuery<DateDimensionImpl> findDateDimensionByYearMonthDayQuery;
    private ParameterExpression<Integer> yearParameter;
    private ParameterExpression<Integer> monthParameter;
    private ParameterExpression<Integer> dayParameter;
    
    private EntityManager entityManager;

    @PersistenceContext(unitName = "uPortalAggrEventsPersistence")
    public final void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.entityManager;
    }
    
    @Override
    protected void buildCriteriaQueries(CriteriaBuilder cb) {
        this.yearParameter = cb.parameter(Integer.class, "hour");
        this.monthParameter = cb.parameter(Integer.class, "minute");
        
        this.findAllDateDimensionsQuery = this.buildFindAllDateDimensions(cb);
        this.findDateDimensionByYearMonthDayQuery = this.buildFindDateDimensionByYearMonthDayQuery(cb);
    }
    
    protected CriteriaQuery<DateDimensionImpl> buildFindAllDateDimensions(final CriteriaBuilder cb) {
        final CriteriaQuery<DateDimensionImpl> criteriaQuery = cb.createQuery(DateDimensionImpl.class);
        final Root<DateDimensionImpl> definitionRoot = criteriaQuery.from(DateDimensionImpl.class);
        criteriaQuery.select(definitionRoot);
        
        return criteriaQuery;
    }
    
    protected CriteriaQuery<DateDimensionImpl> buildFindNewestDateDimension(final CriteriaBuilder cb) {
        final CriteriaQuery<Date> criteriaQuery = cb.createQuery(Date.class);
        final Root<DateDimensionImpl> definitionRoot = criteriaQuery.from(DateDimensionImpl.class);
        final Expression<Date> maxFullDate = cb.greatest(definitionRoot.get(DateDimensionImpl_.fullDate));
        criteriaQuery.select(maxFullDate);
        return null;
/*
 * http://stackoverflow.com/questions/5185404/jpa-eclipselink-subquery-in-where-clause-with-between-criteriabuilder-and-metam
 * 
CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
Root from = criteriaQuery.from(SimpleBean.class);
 
Expression minExpression = criteriaBuilder.min(from.get("pint"));
CriteriaQuery<Object> select = criteriaQuery.select(minExpression);
 
TypedQuery<Object> typedQuery = entityManager.createQuery(select);
Object minExpected = typedQuery.getSingleResult();
assertEquals(minActual, minExpected);
 */
        
        
//        return criteriaQuery;
    }
    
    protected CriteriaQuery<DateDimensionImpl> buildFindDateDimensionByYearMonthDayQuery(final CriteriaBuilder cb) {
        final CriteriaQuery<DateDimensionImpl> criteriaQuery = cb.createQuery(DateDimensionImpl.class);
        final Root<DateDimensionImpl> definitionRoot = criteriaQuery.from(DateDimensionImpl.class);
        criteriaQuery.select(definitionRoot);
        criteriaQuery.where(
            cb.and(
                    cb.equal(definitionRoot.get(DateDimensionImpl_.year), this.yearParameter),
                    cb.equal(definitionRoot.get(DateDimensionImpl_.month), this.monthParameter),
                    cb.equal(definitionRoot.get(DateDimensionImpl_.day), this.dayParameter)
            )
        );
        
        return criteriaQuery;
    }

    @Override
    @Transactional
    public DateDimension createDateDimension(int year, int month, int day) {
        //TODO qtr/term lookup
        final DateDimension dateDimension = new DateDimensionImpl(year, month, day, -1, null);
        
        this.entityManager.persist(dateDimension);
        
        return dateDimension;
    }

    @Override
    public List<DateDimension> getDateDimensions() {
        final TypedQuery<DateDimensionImpl> query = this.createQuery(this.findAllDateDimensionsQuery, FIND_ALL_TIME_DIMENSIONS_CACHE_REGION);
        
        final List<DateDimensionImpl> portletDefinitions = query.getResultList();
        return new ArrayList<DateDimension>(portletDefinitions);
    }
    
    @Override
    public DateDimension getDateDimensionById(long key) {
        final DateDimension dateDimension = this.entityManager.find(DateDimensionImpl.class, key);
        
        return dateDimension;
    }
    
    @Override
    public DateDimension getDateDimensionForDate(Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return this.getDateDimensionForCalendar(cal);
    }
    
    @Override
    public DateDimension getDateDimensionForTimeInMillis(long time) {
        final Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        return this.getDateDimensionForCalendar(cal);
    }
    
    @Override
    public DateDimension getDateDimensionForCalendar(Calendar calendar) {
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        return this.getDateDimensionByYearMonthDay(year, month, day);
    }
    
    @Override
    public DateDimension getDateDimensionByYearMonthDay(int year, int month, int day) {
        final TypedQuery<DateDimensionImpl> query = this.createQuery(this.findDateDimensionByYearMonthDayQuery, FIND_TIME_DIMENSION_BY_HOUR_MINUTE_CACHE_REGION);
        query.setParameter(this.yearParameter, year);
        query.setParameter(this.monthParameter, month);
        query.setParameter(this.dayParameter, day);
        query.setMaxResults(1);
        
        final List<DateDimensionImpl> portletDefinitions = query.getResultList();
        return DataAccessUtils.uniqueResult(portletDefinitions);
    }
}
