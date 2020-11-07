package sys.app.onlinenotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;


@SpringBootApplication
@EnableEurekaClient
@EnableRedisRepositories
public class OnlinenotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinenotesApplication.class, args);
	}

}
