create table CEDG_EMPLOYEE_WORKGROUP_LINK (
    WORKGROUP_ID varchar(36) not null,
    EMPLOYEE_ID varchar(36) not null,
    primary key (WORKGROUP_ID, EMPLOYEE_ID)
);
