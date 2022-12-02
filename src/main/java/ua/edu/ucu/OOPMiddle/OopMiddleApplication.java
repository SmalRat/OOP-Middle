package ua.edu.ucu.OOPMiddle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class OopMiddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopMiddleApplication.class, args);
	}

}
