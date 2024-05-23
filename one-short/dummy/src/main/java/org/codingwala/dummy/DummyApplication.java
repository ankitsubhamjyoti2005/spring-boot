package org.codingwala.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		System.out.println("hello rte");
		SpringApplication.run(DummyApplication.class, args);
	}

}
