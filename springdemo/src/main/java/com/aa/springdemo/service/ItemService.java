package com.aa.springdemo.service;

import com.aa.springdemo.entity.Item;
import com.aa.springdemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

@Autowired
    private ItemRepository itemRepository;

    public void createItem(Item item){
        itemRepository.save(item);
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

}
