package com.smartfarm.inventory_service.service;

import com.netflix.discovery.converters.Auto;
import com.smartfarm.inventory_service.model.Inventory;
import com.smartfarm.inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory addInventoy(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAll(){
        return inventoryRepository.findAll();
    }

    public void delete(Long id){
        inventoryRepository.deleteById(id);
    }
}
