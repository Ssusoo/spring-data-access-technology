package me.ssu.springdataaccesstechnology;


import me.ssu.springdataaccesstechnology.global.config.MemoryConfig;
import me.ssu.springdataaccesstechnology.domains.item.repository.ItemRepository;
import me.ssu.springdataaccesstechnology.global.config.TestDataInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;


@Import(MemoryConfig.class)
@SpringBootApplication(scanBasePackages = "me.ssu.springdataaccesstechnology.itemservice.web")
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	@Bean
	@Profile("local")
	public TestDataInit testDataInit(ItemRepository itemRepository) {
		return new TestDataInit(itemRepository);
	}
}
