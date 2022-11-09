package me.ssu.springdataaccesstechnology.itemservice.service;


import me.ssu.springdataaccesstechnology.domains.item.domain.Item;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemSearchCond;
import me.ssu.springdataaccesstechnology.itemservice.repository.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

// 서비스에 Interface를 하는 경우가 드물다.
public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}