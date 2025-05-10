package io.github.example_java_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;


@SpringBootApplication
@RestController
public class ExampleJavaApiApplication {

	@GetMapping("/test")
	@Operation(summary = "Endpoint de teste", description = "Retorna uma saudação simples")
	public String helloWorld(){
		return "Hello Word";
	}

	public static void main(String[] args) {
		SpringApplication.run(ExampleJavaApiApplication.class, args);
	}

}
