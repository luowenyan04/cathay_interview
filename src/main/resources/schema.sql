create table currency
(
    name        varchar(3),
    name_ZH     varchar(6),
    rate        number(12, 4),
    update_time date,
    primary key (name)
);

insert into currency (name, name_zh)
values ('USD', '美元');
insert into currency (name, name_zh)
values ('GBP', '英鎊');
insert into currency (name, name_zh)
values ('EUR', '歐元');