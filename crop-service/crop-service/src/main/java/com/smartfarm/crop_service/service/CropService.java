package com.smartfarm.crop_service.service;

import com.smartfarm.crop_service.model.Crop;
import com.smartfarm.crop_service.repository.CropRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CropService {

    private final CropRepository cropRepository;

    public Crop addCrop(Crop crop) {
        return cropRepository.save(crop);
    }

    public List<Crop> getAllCrops() {
        return cropRepository.findAll();
    }

    public Crop updateCrop(Long id, Crop cropDetails) {
        Crop crop = cropRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Crop not found"));

        crop.setName(cropDetails.getName());
        crop.setCategory(cropDetails.getCategory());
        crop.setPricePerKg(cropDetails.getPricePerKg());
        crop.setSeason(cropDetails.getSeason());

        return cropRepository.save(crop);
    }

    public void deleteCrop(Long id) {
        cropRepository.deleteById(id);
    }
}