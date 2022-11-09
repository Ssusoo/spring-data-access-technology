package me.ssu.springdataaccesstechnology.itemservice.config;


import me.ssu.springdataaccesstechnology.domains.item.repository.ItemRepository;
import me.ssu.springdataaccesstechnology.itemservice.repository.memory.MemoryItemRepository;
import me.ssu.springdataaccesstechnology.domains.item.service.ItemService;
import me.ssu.springdataaccesstechnology.domains.item.service.ItemServiceV1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryConfig {

    @Bean
    public ItemService itemService() {
        return new ItemServiceV1(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {
        return new MemoryItemRepository();
    }

}