package me.nickcarroll.app;

import me.nickcarroll.app.service.HelloWorldService;
import me.nickcarroll.app.service.MessageScramblerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("me.nickcarroll.app");
        context.refresh();
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        System.out.println(helloWorldService.sayHello());

        MessageScramblerService messageScramblerService = context.getBean(MessageScramblerService.class);
        System.out.println("Scrambled plaintext:" + messageScramblerService.scramble("plaintext"));
    }
}
