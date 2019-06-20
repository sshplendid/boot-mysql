package me.shawn.study.rdb.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EtcConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
