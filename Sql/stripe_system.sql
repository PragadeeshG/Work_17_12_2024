create table if not exists stripe_system(
system_code bigint not null,
payment_id varchar(255) null,
session_id varchar(255) null,
payment_status varchar(255) null,
payment_gateway varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint stripe_system_pk primary key(system_code));