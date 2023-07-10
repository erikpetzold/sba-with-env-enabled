package de.codecentric.demo.sbawithenvenabled;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SbaWithEnvEnabledApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaWithEnvEnabledApplication.class, args);
	}

}
