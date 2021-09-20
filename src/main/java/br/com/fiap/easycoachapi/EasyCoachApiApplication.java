package br.com.fiap.easycoachapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EasyCoachApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyCoachApiApplication.class, args);
	}

}
