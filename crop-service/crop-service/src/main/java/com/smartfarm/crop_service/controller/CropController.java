package com.smartfarm.crop_service.controller;

import com.smartfarm.crop_service.model.Crop;
import com.smartfarm.crop_service.service.CropService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crops")
@RequiredArgsConstructor
public class CropController {

    private final CropService cropService;

    @PostMapping
    public Crop addCrop(@RequestBody Crop crop) {
        return cropService.addCrop(crop);
    }

    @GetMapping
    public List<Crop> getAllCrops() {
        return cropService.getAllCrops();
    }

    @PutMapping("/{id}")
    public Crop updateCrop(@PathVariable Long id, @RequestBody Crop crop) {
        return cropService.updateCrop(id, crop);
    }

    @DeleteMapping("/{id}")
    public void deleteCrop(@PathVariable Long id) {
        cropService.deleteCrop(id);
    }
}