-- begin CEDG_TOWN_HALL
create table CEDG_TOWN_HALL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CEDG_TOWN_HALL
-- begin CEDG_WORKGROUP
create table CEDG_WORKGROUP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    TOWN_HALL_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEDG_WORKGROUP

-- begin CEDG_EMPLOYEE
create table CEDG_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    SYSTEM_USER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CEDG_EMPLOYEE
-- begin CEDG_TOWN_HALL_EMPLOYEE_LINK
create table CEDG_TOWN_HALL_EMPLOYEE_LINK (
    TOWN_HALL_ID varchar(36) not null,
    EMPLOYEE_ID varchar(36) not null,
    primary key (TOWN_HALL_ID, EMPLOYEE_ID)
)^
-- end CEDG_TOWN_HALL_EMPLOYEE_LINK
-- begin CEDG_EMPLOYEE_WORKGROUP_LINK
create table CEDG_EMPLOYEE_WORKGROUP_LINK (
    WORKGROUP_ID varchar(36) not null,
    EMPLOYEE_ID varchar(36) not null,
    primary key (WORKGROUP_ID, EMPLOYEE_ID)
)^
-- end CEDG_EMPLOYEE_WORKGROUP_LINK
