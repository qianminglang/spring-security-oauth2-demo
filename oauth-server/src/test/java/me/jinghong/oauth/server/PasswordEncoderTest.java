package me.jinghong.oauth.server;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTest {

    PasswordEncoder encoder = new BCryptPasswordEncoder();

    @Test
    public void encode() {
        System.out.println(encoder.encode("123456"));
    }
}
