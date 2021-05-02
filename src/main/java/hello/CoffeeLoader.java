package hello;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

@Component
public class CoffeeLoader {
	private final ReactiveRedisConnectionFactory factory;
	private final ReactiveRedisOperations<String, Coffee> coffeeOps;

	public CoffeeLoader(ReactiveRedisConnectionFactory factory, ReactiveRedisOperations<String, Coffee> coffeeOps) {
		this.factory = factory;
		this.coffeeOps = coffeeOps;
	}

	@PostConstruct
	public void loadData() {
		
	}
}
