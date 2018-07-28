create table CEDG_TOWN_HALL_EMPLOYEE_LINK (
    TOWN_HALL_ID varchar(36) not null,
    EMPLOYEE_ID varchar(36) not null,
    primary key (TOWN_HALL_ID, EMPLOYEE_ID)
);
