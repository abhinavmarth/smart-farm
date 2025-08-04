package com.smartfarm.crop_analysis_service.service;

import com.smartfarm.crop_analysis_service.model.Crop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CropService {

    public String analyze(Crop data){
        if (data.getTemperature() > 35) {
            return "High temperature detected. Consider irrigation.";
        } else if (data.getHumidity() < 30) {
            return "Low humidity. Risk of crop dehydration.";
        } else {
            return "Conditions are optimal for " + data.getCropType();
        }
    }
}
