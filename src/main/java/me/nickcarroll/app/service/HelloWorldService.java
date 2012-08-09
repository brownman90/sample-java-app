package me.nickcarroll.app.service;

public class HelloWorldService {

    public static String BAD_MEMBER_VARIABLE = "Hello world!";

    public String sayHello() {
        return BAD_MEMBER_VARIABLE;
    }

    public String sayHelloTo(String name) {
        return String.format("Hello %s!", name);
    }
}
