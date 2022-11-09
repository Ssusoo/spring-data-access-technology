package me.ssu.springdataaccesstechnology.itemservice.service;


import me.ssu.springdataaccesstechnology.itemservice.domain.Item;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemSearchCond;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}