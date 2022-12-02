//package ua.edu.ucu.OOPMiddle.Test;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import ua.edu.ucu.OOPMiddle.Company.Company;
//import ua.edu.ucu.OOPMiddle.DataAccess.CompanyRepository;
//
//import java.util.List;
//
//@Configuration
//public class CompanyConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(CompanyRepository repository) {
//        return args -> {
//            Company firstCompany = new Company(
//                    "Ukrainian Catholic University",
//                    "https://twitter.com/ucu_university",
//                    "https://www.facebook.com/UkrainianCatholicUniversity",
//                    "https://mywebsite.com/logo.png",
//                    "https://mywebsite.com/icon.png",
//                    "501-1000",
//                    "17 Sventsitskoho street, Lviv, Ukraine"
//            );
//            repository.saveAll(List.of(firstCompany));
//        };
//    }
//}
