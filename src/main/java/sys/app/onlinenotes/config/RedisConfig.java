package sys.app.onlinenotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
//import org.springframework.data.redis.core.RedisAccessor;
//import org.springframework.data.redis.core.RedisTemplate;


@Configuration
public class RedisConfig {
	
	/*
	 * @Bean public LettuceConnectionFactory redisConnectionFactory() { return new
	 * LettuceConnectionFactory(); }
	 */
	
	@Bean
	public ReactiveRedisConnectionFactory reactiveRedisConnectionFactory() {
	    return new LettuceConnectionFactory();
	}
	 
	@Bean
	public ReactiveStringRedisTemplate reactiveRedisTemplate(ReactiveRedisConnectionFactory redisConnectionFactory) {
	    return new ReactiveStringRedisTemplate(redisConnectionFactory);
	}
	
		/*
		 * @Bean public ReactiveRedisTemplate<String, Object> redisTemplate() {
		 * RedisTemplate<String, Object> template = new
		 * RedisTemplate<>();
		 * template.setConnectionFactory(redisConnectionFactory()); return template; }
		 */
}