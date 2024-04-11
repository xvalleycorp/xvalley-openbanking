package com.xvalley.openbanking;

import com.sun.tools.javac.Main;
import com.xvalley.openbanking.controller.ContactHandlerController;
import com.xvalley.openbanking.models.persistence.DemoPersistence;
import com.xvalley.openbanking.models.persistence.IPersistence;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BianOpenBankingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BianOpenBankingDemoApplication.class, args);
	}
}
