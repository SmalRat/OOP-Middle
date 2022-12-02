package ua.edu.ucu.OOPMiddle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class OopMiddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopMiddleApplication.class, args);
	}

	@GetMapping
	public List<String> getStudent() {
		return List.of("Hello");
	}

}
