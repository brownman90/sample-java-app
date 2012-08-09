package me.nickcarroll.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class Rot13CipherTest {

    @Test
    public void shouldRotateLowercaseAAAToLowercaseNNN() {
        Rot13Cipher rot13Cipher = new Rot13Cipher();
        String rotatedText = rot13Cipher.rotate("aaa");
        assertEquals("nnn", rotatedText);
    }

    @Test
    public void shouldRotateUppercaseAAAToUppercaseNNN() {
        Rot13Cipher rot13Cipher = new Rot13Cipher();
        String rotatedText = rot13Cipher.rotate("AAA");
        assertEquals("NNN", rotatedText);
    }

    @Test
    public void shouldRotateLowercaseBBBToLowercaseOOO() {
        Rot13Cipher rot13Cipher = new Rot13Cipher();
        String rotatedText = rot13Cipher.rotate("bbb");
        assertEquals("ooo", rotatedText);
    }

    @Test
    public void shouldRotateLowercaseZZZToLowercaseMMM() {
        Rot13Cipher rot13Cipher = new Rot13Cipher();
        String rotatedText = rot13Cipher.rotate("zzz");
        assertEquals("mmm", rotatedText);
    }

    @Test
    public void shouldRotateUppercaseZZZToUppercaseMMM() {
        Rot13Cipher rot13Cipher = new Rot13Cipher();
        String rotatedText = rot13Cipher.rotate("ZZZ");
        assertEquals("MMM", rotatedText);
    }

    @Test
    public void shouldRotateLowercaseYYYToLowercaseLLL() {
        Rot13Cipher rot13Cipher = new Rot13Cipher();
        String rotatedText = rot13Cipher.rotate("yyy");
        assertEquals("lll", rotatedText);
    }
}
