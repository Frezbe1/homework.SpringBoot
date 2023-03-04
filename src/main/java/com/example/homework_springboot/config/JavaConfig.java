package com.example.homework_springboot.config;

import com.example.homework_springboot.profile.DevProfile;
import com.example.homework_springboot.profile.ProductionProfile;
import com.example.homework_springboot.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(
            name = "netology.profile.dev",
            havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            name = "netology.profile.dev", //поиск в файле application.properties
            havingValue = "false", //ищем значения поля на совпадение
            matchIfMissing = true) // если такого поля нет, то принимаем данное значение
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}