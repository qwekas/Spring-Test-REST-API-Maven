package qwekas.springtestrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "qwekas.springtestrestapi")
public class SpringTestRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestRestApiApplication.class, args);
	}

}
