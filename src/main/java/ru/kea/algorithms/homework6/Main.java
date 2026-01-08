package ru.kea.algorithms.homework6;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello!";

        System.out.println(str1 + "\tMD5: " + getMd5(str1));
        System.out.println(str2 + "\tMD5: " + getMd5(str2));
        System.out.println(str3 + "\tMD5: " + getMd5(str3));

        System.out.println(str1 + "\tSHA256: " + getSha256(str1));
        System.out.println(str2 + "\tSHA256: " + getSha256(str2));
        System.out.println(str3 + "\tSHA256: " + getSha256(str3));
    }

    private static String getMd5(String string) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] message = digest.digest(string.getBytes());
        return byteArrayToString(message);
    }

    private static String getSha256(String string) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA256");
        byte[] message = digest.digest(string.getBytes());
        return byteArrayToString(message);
    }

    private static String byteArrayToString(byte[] message) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : message) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}

