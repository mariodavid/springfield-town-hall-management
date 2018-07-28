alter table CEDG_USER rename to CEDG_USER__U31477 ;
alter table CEDG_USER_WORKGROUP_LINK drop constraint FK_USEWOR_ON_USER ;
alter table CEDG_TOWN_HALL_USER_LINK drop constraint FK_TOWHALUSE_ON_USER ;
