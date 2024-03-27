package com.jeffgomez.demo;

import com.jeffgomez.demo.customer.Customer;
import com.jeffgomez.demo.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	//db


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner (CustomerRepository customerRepository){

		return args -> {

			Customer alex = new Customer(
					"Alex",
					"alex@gmail.com",
					21
			);


			Customer jamila = new Customer(
					"Jamila",
					"jamila@gmail.com",
					19
			);
			List<Customer> customers = List.of(alex, jamila);
			customerRepository.saveAll(customers);

		};
	}

}
