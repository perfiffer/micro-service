package com.perfiffer.example;

import com.perfiffer.example.aop.Speakable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

	/*@Autowired
	private Speakable personSpring;
*/
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			//spring aop
			System.out.println("******** spring aop **********");
			personSpring.sayHi();
			personSpring.sayBye();
			System.exit(0);
		};
	}*/
}
