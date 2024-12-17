create table if not exists zelle_system(
system_code bigint not null,
order_id varchar(255) null,
reciept_url varchar(255) null,
primary_account_type varchar(255) null,
transaction_status varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint zelle_system_pk primary key(system_code));