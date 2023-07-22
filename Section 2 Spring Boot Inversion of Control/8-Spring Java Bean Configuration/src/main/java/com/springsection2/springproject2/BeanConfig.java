package com.springsection2.springproject2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Coach swimCoach(){
        return new SwinCoach();
    }
}
