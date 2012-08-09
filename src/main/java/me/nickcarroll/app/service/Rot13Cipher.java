package me.nickcarroll.app.service;

public class Rot13Cipher {

    private static final int ROT13 = 13;

    public String rotate(String plainText) {

        char[] plainTextChars = plainText.toCharArray();
        StringBuilder rotatedChars = new StringBuilder();

        for (char plainTextChar : plainTextChars) {
            if ((plainTextChar >= 'a' && plainTextChar <= 'm') || (plainTextChar >= 'A' && plainTextChar <= 'M')) {
                plainTextChar += ROT13;
            } else if ((plainTextChar >= 'm' && plainTextChar <= 'z') || (plainTextChar >= 'M' && plainTextChar <= 'Z')) {
                plainTextChar -= ROT13;
            }

            rotatedChars.append(plainTextChar);
        }

        return rotatedChars.toString();
    }
}
