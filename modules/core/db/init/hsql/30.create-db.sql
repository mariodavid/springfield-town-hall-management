insert into CEDG_TOWN_HALL
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('43ff4010-2eaf-4f15-bd6b-842ca60d3ea3', 2, '2018-07-28 11:32:54', 'admin', '2018-07-28 12:38:51', 'admin', null, null, 'Town Hall Springfield');

insert into CEDG_TOWN_HALL
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME)
values ('72a11e42-2380-2c0a-1a89-1d5d69da28f9', 2, '2018-07-28 11:33:29', 'admin', '2018-07-28 12:38:54', 'admin', null, null, 'Town Hall Shelbyville');



insert into CEDG_WORKGROUP
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, TOWN_HALL_ID)
values ('63c3dff6-c036-6f88-140f-9f13204711cf', 3, '2018-07-28 11:33:57', 'admin', '2018-07-28 12:39:27', 'admin', null, null, 'Get better then Springfield initiative', '72a11e42-2380-2c0a-1a89-1d5d69da28f9');

insert into CEDG_WORKGROUP
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, TOWN_HALL_ID)
values ('dfe0d207-c7b4-6901-5819-6c5d21c76f53', 3, '2018-07-28 11:33:16', 'admin', '2018-07-28 12:40:58', 'admin', null, null, 'Nuclear ultimate MCA preventions workgroup', '43ff4010-2eaf-4f15-bd6b-842ca60d3ea3');


insert into CEDG_EMPLOYEE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, SYSTEM_USER_ID)
values ('228ea18c-d3e2-c4f2-e974-2cc16863f380', 2, '2018-07-28 11:34:15', 'admin', '2018-07-28 12:34:47', 'admin', null, null, 'Mayor Quimby', null);
insert into CEDG_EMPLOYEE
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, SYSTEM_USER_ID)
values ('6e6ffdef-2f93-1e00-b43e-814a92705911', 8, '2018-07-28 11:34:25', 'admin', '2018-07-28 12:41:30', 'admin', null, null, 'Chief Wiggum', null);
