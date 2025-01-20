package com.ShopEase;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtil {

    public static void main(String[] args) {
        // Password encoder object banate hain
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        // Jo password aap set karna chahte hain, usko encode karte hain
        String rawPassword = "yourPassword123"; // Ye apna plain text password daalenge
        String encodedPassword = encoder.encode(rawPassword);

        // Encoded password ko print karna
        System.out.println("Encoded Password: " + encodedPassword);
    }
}