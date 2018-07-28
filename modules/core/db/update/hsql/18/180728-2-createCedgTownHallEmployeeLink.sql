alter table CEDG_TOWN_HALL_EMPLOYEE_LINK add constraint FK_TOWHALEMP_ON_TOWN_HALL foreign key (TOWN_HALL_ID) references CEDG_TOWN_HALL(ID);
alter table CEDG_TOWN_HALL_EMPLOYEE_LINK add constraint FK_TOWHALEMP_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references CEDG_EMPLOYEE(ID);
