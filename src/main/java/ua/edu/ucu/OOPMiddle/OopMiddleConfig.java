package ua.edu.ucu.OOPMiddle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OopMiddleConfig {
    @Bean
    public String getData() {
        return "hello, world!";
    }
}
