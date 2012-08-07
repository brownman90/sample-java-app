package me.nickcarroll.app;

import me.nickcarroll.app.service.HelloWorldService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("me.nickcarroll.app");
        context.refresh();
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        System.out.println(helloWorldService.sayHello());
    }
}
