package al.powerlifting.fitnessapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FitnessapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessapiApplication.class, args);
	}

}
