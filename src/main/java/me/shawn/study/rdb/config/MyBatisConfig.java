package me.shawn.study.rdb.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MyBatisConfig {

    @Autowired
    private ApplicationContext applicationContext;

    /*
    @Profile("mem")
    @Bean
    public SqlSessionFactoryBean h2SqlSessionFactory(DataSource h2DataSource) throws IOException {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(h2DataSource);
        sessionFactory.setConfigLocation(applicationContext.getResource("classpath:sql/mybatis-config.xml"));
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath:sql/mapper/*-mapper.xml"));
        sessionFactory.setTypeAliasesPackage("me.shawn.study.rdb.model");
        return sessionFactory;
    }
     */

//    @Profile("local")
    @Bean
    public SqlSessionFactoryBean localSqlSessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setConfigLocation(applicationContext.getResource("classpath:sql/mybatis-config.xml"));
        sessionFactory.setMapperLocations(applicationContext.getResources("classpath:sql/mapper/*-mapper.xml"));
        sessionFactory.setTypeAliasesPackage("me.shawn.study.rdb.model");
        return sessionFactory;
    }
}
