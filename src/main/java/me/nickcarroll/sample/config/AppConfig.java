package me.nickcarroll.sample.config;

import me.nickcarroll.sample.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }
}
