package main.designPatters;

import main.facade.HomeTheaterFacade;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"main.facade", "main.subsystem"})
public class DesignPattersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPattersApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			HomeTheaterFacade homeTheater = ctx.getBean(HomeTheaterFacade.class);
			homeTheater.watchMovie("The Matrix");
			homeTheater.endMovie();
		};

}} 

