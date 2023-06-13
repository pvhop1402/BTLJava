CREATE DATABASE DangNhap
use DangNhap

create table ACCOUNT(
username varchar(20),
gmail nchar(50),
pass char(20),
confirmpass char(20),
constraint PK_US primary key (username),
)
Insert into ACCOUNT values('admin','admin@gmail.com','123','123')
drop table ACCOUNT
select * from ACCOUNT