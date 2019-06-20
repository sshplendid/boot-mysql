-- create database study;
CREATE USER studyuser@'%' IDENTIFIED BY 'study1';
GRANT ALL PRIVILEGES ON study.* TO studyuser@'%' IDENTIFIED BY 'study1' WITH GRANT OPTION;
use study;


-- DROP TABLE IF EXISTS MEMBER;

CREATE TABLE MEMBER (id int PRIMARY KEY AUTO_INCREMENT, name varchar(100), phone_number varchar(100), email varchar(100), age int);

INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('김갑수', '01056930000', 'kapsu@gmail.com', 32);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('David', '01012345678', 'david@gmail.com', 20);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('John', '01033335555', 'john@gmail.com', 26);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('홍길동', '01612341234', 'hong1@gmail.com', 52);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('홍길동', '01044441111', 'hong1@naver.com', 21);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('김첨지', '01111111111', 'kim@gmail.com', 36);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('Kate', '01033335555', 'kate@gmail.com', 27);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('김기태', '01612341234', 'kim2@gmail.com', 52);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('정재윤', '01044441111', 'gom@naver.com', 21);
INSERT INTO MEMBER (name, phone_number, email, age) VALUES ('김승래', '01111111111', 'kim3@gmail.com', 36);