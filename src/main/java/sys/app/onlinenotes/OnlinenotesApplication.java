package sys.app.onlinenotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class OnlinenotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinenotesApplication.class, args);
	}

}
