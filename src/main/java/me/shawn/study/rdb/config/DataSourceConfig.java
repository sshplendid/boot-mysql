package me.shawn.study.rdb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Profile("mem")
    @Bean
    @ConfigurationProperties("spring.multi-datasources.h2")
    public DataSource h2DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Profile("local")
    @Bean
    @ConfigurationProperties("spring.multi-datasources.local")
    public DataSource localDataSource() {
        return DataSourceBuilder.create().build();
    }
}
