package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.JAXBException;
import java.beans.Customizer;
import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DemoApplication.class, args);
		CustomerRepository customerRepository =
				configurableApplicationContext.getBean(CustomerRepository.class);
	}


	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

/*			try {
				Marshal.marshal(, new File("customer.xml"));
			} catch (IOException | JAXBException e)

			{
				e.printStackTrace();
			}
	};
}*/
		};
	}
}


