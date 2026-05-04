package ph.batch.read.input;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class InputApplication {

	public static void main(String[] args) {
		SpringApplication.run(InputApplication.class, args);
	}

}
