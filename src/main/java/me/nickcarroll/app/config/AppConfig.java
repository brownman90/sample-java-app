package me.nickcarroll.app.config;

import me.nickcarroll.app.service.EmptyRot13Cipher;
import me.nickcarroll.app.service.HelloWorldService;
import me.nickcarroll.app.service.MessageScramblerService;
import me.nickcarroll.app.service.Rot13Cipher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }

    @Bean
    public EmptyRot13Cipher emptyRot13Cipher() {
        return new EmptyRot13Cipher();
    }

    @Bean
    public Rot13Cipher rot13Cipher() {
        return new Rot13Cipher();
    }

    @Bean
    public MessageScramblerService messageScramblerService() {
        return new MessageScramblerService(rot13Cipher());
    }
}
