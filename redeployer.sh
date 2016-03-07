#!/bin/sh

if test -d uportal-portlets-overlay/$1; then
  PORTLET=$1
  echo "redéploiement portlet $PORTLET"
  cd uportal-portlets-overlay/$PORTLET
  mvn clean install
  cd ../..
  ant deployPortletApp -DportletApp=uportal-portlets-overlay/$PORTLET/target/${PORTLET}.war
else
  echo "le portlet $1 n'a pas été trouvé dans uportal-portlets-overlay"
fi
