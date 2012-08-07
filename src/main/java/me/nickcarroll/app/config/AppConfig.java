package me.nickcarroll.app.config;

import me.nickcarroll.app.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }
}
