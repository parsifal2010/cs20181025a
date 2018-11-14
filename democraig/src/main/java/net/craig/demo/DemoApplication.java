package net.craig.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.err.println("net.craig.demo.DemoApplication.main():  Entered.  Release 0.0.1-SNAPSHOT");
		SpringApplication.run(DemoApplication.class, args);
		System.err.println("net.craig.demo.DemoApplication.main():  Exited.");
	}
}
