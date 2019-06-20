# Spring Boot - RDB

이 소스코드는 스프링 부트에 RDBMS를 연결하는 예제이다.

## 준비사항

### MySQL with Docker

Docker로 MySQL RDBMS 서버를 구동한다.

```bash
cd docker
docker-compose up -d
```

### todo

* [x] todo-01: docker mysql 구동할 때 초기 db 데이터 적재하기
* [x] todo-02: mybatis underscore to camelcase
* [ ] todo-03: 멤버 등록 폼 작성
* [ ] todo-04: 데이터 CUD 기능 개발
* [ ] todo-05: 테이블 행 클릭시 단건 조회



## demo

http://localhost:8080/html/member.html