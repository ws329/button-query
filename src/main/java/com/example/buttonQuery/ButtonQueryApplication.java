package com.example.buttonQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ButtonQueryApplication {
	private static final Logger log = LoggerFactory.getLogger(ButtonQueryApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ButtonQueryApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(Repository repository) {
		return (args) -> {

			log.info("Buttons found with findAll():");
			log.info("-------------------------------");
			for (Button button : repository.findAll()) {
				log.info(button.toString());
			}
			log.info("");

			Button button = repository.findById(329);
			log.info("Button found with findById(329):");
			log.info("--------------------------------");
			log.info(button.toString());
			log.info("");

			log.info("Buttons found with findByLastName('Xiaomi'):");
			log.info("--------------------------------------------");
			repository.findByName("Xiaomi").forEach(xiaomi -> {
				log.info(xiaomi.toString());
			});
			log.info("");
		};
	}
}
