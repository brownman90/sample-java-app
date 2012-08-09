package me.nickcarroll.app.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MessageScramblerServiceTest {

    @Mock
    private Rot13Cipher rot13Cipher;

    @Before public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldScrambleMessageUsingRot13Cipher() {
        MessageScramblerService messageScramblerService = new MessageScramblerService(rot13Cipher);

        when(rot13Cipher.rotate("aaa")).thenReturn("nnn");

        String scrambledText = messageScramblerService.scramble("aaa");

        assertEquals("nnn", scrambledText);
    }
}
