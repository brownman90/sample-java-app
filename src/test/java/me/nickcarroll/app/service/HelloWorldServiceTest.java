package me.nickcarroll.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldServiceTest {

    @Test
    public void shouldSayHelloWorld() {
        HelloWorldService helloWorldService = new HelloWorldService();
        assertEquals("Hello world!", helloWorldService.sayHello());
    }

    @Test
    public void shouldSayHelloToDmitry() {
        HelloWorldService helloWorldService = new HelloWorldService();

        assertEquals("Hello Dmitry!", helloWorldService.sayHelloTo("Dmitry"));
    }

    @Test
    public void shouldSayHelloToTony() {
        HelloWorldService helloWorldService = new HelloWorldService();

        assertEquals("Hello Tony!", helloWorldService.sayHelloTo("Tony"));
    }

}
