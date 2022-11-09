package me.ssu.springdataaccesstechnology.itemservice.service;

import lombok.RequiredArgsConstructor;
import me.ssu.springdataaccesstechnology.domains.item.domain.Item;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemRepository;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemSearchCond;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceV1 implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemRepository.update(itemId, updateParam);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> findItems(ItemSearchCond cond) {
        return itemRepository.findAll(cond);
    }
}
