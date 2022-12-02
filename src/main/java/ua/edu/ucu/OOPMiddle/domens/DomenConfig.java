package ua.edu.ucu.OOPMiddle.domens;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DomenConfig {
    @Bean
    CommandLineRunner commandLineRunner(DomenRepository repository) {
        return args -> {
            Domen firstDomen = new Domen(
                    "Ukrainian Catholic University",
                    "https://twitter.com/ucu_university",
                    "https://www.facebook.com/UkrainianCatholicUniversity",
                    "https://mywebsite.com/logo.png",
                    "https://mywebsite.com/icon.png",
                    "501-1000",
                    "17 Sventsitskoho street, Lviv, Ukraine"
            );
            repository.saveAll(List.of(firstDomen));
        };
    }
}
