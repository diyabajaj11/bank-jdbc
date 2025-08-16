create database bank;
use bank;

CREATE table employee(
	id int primary key,
    name VARCHAR(20)
    );
    
INSERT INTO EMPLOYEE values (101,"priti");
Insert into employee values (102,"diya");
iNSERT INTO EMPLOYEE values (103,"khushi");
iNSERT INTO EMPLOYEE values (104,"dhruv");
iNSERT INTO EMPLOYEE values (105,"Arya");

drop table employee;


select * from employee;

drop database bank;