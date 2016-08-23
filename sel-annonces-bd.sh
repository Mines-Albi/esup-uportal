#!/bin/sh

psql --dbname=uportal4 --quiet --username=uportal --no-password <<FIN

select * from admins;
select * from topic;
select * from announcement;
select * from announcement_attachment;
select * from audience;
select * from authors;
select * from moderators;
select * from subscription;

FIN

exit

create table ADMINS (PARENT_ID int8 not null, ADMIN varchar(255));
create table ANNOUNCEMENT (ANN_ID int8 not null, TITLE text, ABSTRACT text, CREATED timestamp, START_DISPLAY timestamp, END_DISPLAY timestamp, MESSAGE text, AUTHOR varchar(255), LINK varchar(255), PUBLISHED bool not null, PARENT_ID int8, primary key (ANN_ID));
create table ANNOUNCEMENT_ATTACHMENT (ANNOUNCEMENT_ID int8 not null, ATTACHMENT_INFO varchar(255));
create table AUDIENCE (PARENT_ID int8 not null, AUDIENCE_MEMBER varchar(255));
create table AUTHORS (PARENT_ID int8 not null, AUTHOR varchar(255));
create table MODERATORS (PARENT_ID int8 not null, MODERATOR varchar(255));
create table SUBSCRIPTION (SUB_ID int8 not null, TOPIC_ID int8, OWNER_ID varchar(255), SUBSCRIBED bool, primary key (SUB_ID));
create table TOPIC (TOPIC_ID int8 not null, TITLE text, DESCRP text, CREATED_BY varchar(255), ALLOW_RSS bool, SUB_METHOD int4, primary key (TOPIC_ID));

alter table ADMINS add constraint FK72CD5B047D994F46 foreign key (PARENT_ID) references TOPIC;
alter table ANNOUNCEMENT add constraint FK937735477D994F46 foreign key (PARENT_ID) references TOPIC;
alter table ANNOUNCEMENT_ATTACHMENT add constraint FK3E6A231BF93D1933 foreign key (ANNOUNCEMENT_ID) references ANNOUNCEMENT;
alter table AUDIENCE add constraint FK68CCDA047D994F46 foreign key (PARENT_ID) references TOPIC;
alter table AUTHORS add constraint FK4429C287D994F46 foreign key (PARENT_ID) references TOPIC;
alter table MODERATORS add constraint FKA4BBE80E7D994F46 foreign key (PARENT_ID) references TOPIC;
alter table SUBSCRIPTION add constraint FK9E75411DC92380A1 foreign key (TOPIC_ID) references TOPIC;
create sequence hibernate_sequence;

