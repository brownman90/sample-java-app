package me.nickcarroll.app.service;

import me.nickcarroll.sample.service.HelloWorldService;
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
}
