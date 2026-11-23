package dkatalis.test.cli_atm;

import picocli.spring.boot.autoconfigure.PicocliAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliAtmApplication {
	public static void main(String[] args) {
		SpringApplication.run(CliAtmApplication.class, args);
	}

}
