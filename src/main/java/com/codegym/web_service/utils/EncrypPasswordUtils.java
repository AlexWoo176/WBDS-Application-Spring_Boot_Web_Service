package com.codegym.web_service.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncrypPasswordUtils {

    public static String EncrypPasswordUtils(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static void main(String[] args) {
        System.out.println("pass 123456 mã hóa thành: " + EncrypPasswordUtils("123456"));
    }
}
