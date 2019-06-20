package me.shawn.study.rdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "me.shawn.study.rdb.mapper")
public class RdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdbApplication.class, args);
	}

}
