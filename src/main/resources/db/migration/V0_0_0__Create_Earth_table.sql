create table earth_table
(
    uuid varchar(64)
        constraint table_name_pk
            primary key,
    name varchar(128),
    commentary text,
    file text,
    ext varchar(128),
)