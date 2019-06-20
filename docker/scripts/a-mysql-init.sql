create database foo;

DROP TABLE IF EXISTS MEMBER;

CREATE TABLE MEMBER (id int PRIMARY KEY AUTO_INCREMENT, name varchar(100), phone_number varchar(100), email varchar(100), age int);


INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('David', '01020936940', 'david@gmail.com', 32);