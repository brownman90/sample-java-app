package me.nickcarroll.sample;

import me.nickcarroll.sample.service.HelloWorldService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("me.nickcarroll.sample");
        context.refresh();
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        System.out.println(helloWorldService.sayHello());
    }
}
