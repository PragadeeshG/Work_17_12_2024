create table if not exists payment_systems(
payment_id bigint not null,
system_id bigint null,
available_gateways varchar(255) null,
max_transaction_time varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint payment_systems_pk primary key(payment_id));