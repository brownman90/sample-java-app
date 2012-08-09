package me.nickcarroll.app.service;


public class MessageScramblerService {

    private Rot13Cipher rot13Cipher;

    public MessageScramblerService(Rot13Cipher rot13Cipher) {
        this.rot13Cipher = rot13Cipher;
    }

    public String scramble(String plainText) {
        return rot13Cipher.rotate(plainText);
    }
}
