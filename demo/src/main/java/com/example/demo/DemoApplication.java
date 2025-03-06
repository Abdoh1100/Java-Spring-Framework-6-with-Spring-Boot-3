package com.example.demo;

import com.example.demo.model.Alien;
import com.example.demo.model.Computer;
import com.example.demo.model.Laptop;
import com.example.demo.service.ComputerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);

		ComputerService service=context.getBean(ComputerService.class);
		Laptop lap=context.getBean(Laptop.class);
		service.addComputer(lap);
		// where should we write our code for JDBC connection ?
		// in a separate repository class where you hava all the db connections

//		Alien obj=context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());
	}

}
