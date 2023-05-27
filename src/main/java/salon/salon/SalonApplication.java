package salon.salon;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Salon API",
		description = "This is a Spring Boot application Api for a salon.",
		version = "1.0",
		contact = @Contact(name =":"+ " Moh'd Mshimba", email = "mohdmshimba95@gmail.com")
))
public class SalonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonApplication.class, args);
	}

}
