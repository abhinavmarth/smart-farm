package com.smartfarm.crop_service.repository;

import com.smartfarm.crop_service.model.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropRepository extends JpaRepository<Crop, Long> {
    List<Crop> findByCategory(String category);
}