package com.example.customerBoot1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.customerBoot1.CustomerPojo.CustomerPojo;
import com.example.customerBoot1.customerService.customerService;

@SpringBootApplication
public class CustomerBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerBoot1Application.class, args);
	}
	
	/*@Bean
	public CommandLineRunner loadInitialData(customerService service) {
		return (args) -> {
				service.addCustomer(new CustomerPojo(1,"Arijit","biswas@gmail.com","Paris"));
				service.addCustomer(new CustomerPojo(2,"Anirban","anirban@gmail.com","London"));
				service.addCustomer(new CustomerPojo(3,"Raj","raj@gmail.com","NY"));
				service.addCustomer(new CustomerPojo(4,"Rohit","rohit@gmail.com","Florida"));
				service.addCustomer(new CustomerPojo(5,"Purbayan","purbayan@gmail.com","Osaka"));
				System.out.println("Data got stored");
				};
	}*/
	
}
