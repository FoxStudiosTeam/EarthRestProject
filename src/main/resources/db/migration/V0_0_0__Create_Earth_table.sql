create table earth_table
(
    uuid varchar
        constraint table_name_pk
            primary key,
    name varchar,
    commentary varchar,
    file varchar,
    ext varchar,
)