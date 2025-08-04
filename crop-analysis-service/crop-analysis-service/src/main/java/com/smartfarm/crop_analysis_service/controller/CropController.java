package com.smartfarm.crop_analysis_service.controller;

import com.smartfarm.crop_analysis_service.model.Crop;
import com.smartfarm.crop_analysis_service.service.CropService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crop-analysis")
public class CropController {

    @Autowired
    private CropService cropService;

    @PostMapping
    public String analyze(@RequestBody Crop data){
        return cropService.analyze(data);
    }
}
