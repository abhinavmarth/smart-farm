package com.smartfarm.inventory_service.controller;

import com.smartfarm.inventory_service.model.Inventory;
import com.smartfarm.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable Long id){
        inventoryService.delete(id);
    }

    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inventory){
        return inventoryService.addInventoy(inventory);
    }

    @GetMapping
    public List<Inventory> getAllinventory(){
        return inventoryService.getAll();
    }
}
