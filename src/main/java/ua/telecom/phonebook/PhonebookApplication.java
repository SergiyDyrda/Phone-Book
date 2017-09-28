package ua.telecom.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ua.telecom.phonebook.configuration.RepositoryConfig;
import ua.telecom.phonebook.configuration.WebMvcConfig;

@SpringBootApplication
@Import({RepositoryConfig.class, WebMvcConfig.class})
public class PhonebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}
}
