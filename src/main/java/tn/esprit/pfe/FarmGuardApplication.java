package tn.esprit.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@EnableAspectJAutoProxy
@EnableScheduling
@EnableSwagger2*/
@SpringBootApplication
public class FarmGuardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmGuardApplication.class, args);
	}

}
