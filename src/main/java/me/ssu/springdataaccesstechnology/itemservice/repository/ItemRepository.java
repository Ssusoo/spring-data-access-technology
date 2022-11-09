package me.ssu.springdataaccesstechnology.itemservice.repository;

import me.ssu.springdataaccesstechnology.domains.item.domain.Item;
import me.ssu.springdataaccesstechnology.domains.item.dto.ItemSearchCond;
import me.ssu.springdataaccesstechnology.domains.item.dto.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond cond);
}