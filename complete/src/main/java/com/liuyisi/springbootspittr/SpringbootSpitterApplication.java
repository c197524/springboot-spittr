package com.liuyisi.springbootspittr;

import com.liuyisi.springbootspittr.entity.SpitterRowMapper;
import com.liuyisi.springbootspittr.entity.SpittleRowMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootSpitterApplication  {
    @Bean
    public SpittleRowMapper spittleRowMapper() {
        return new SpittleRowMapper();
    }
    @Bean
    public SpitterRowMapper spitterRowMapper() {
        return new SpitterRowMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpitterApplication.class, args);
    }
}
