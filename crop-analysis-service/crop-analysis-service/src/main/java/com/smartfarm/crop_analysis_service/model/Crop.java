package com.smartfarm.crop_analysis_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Crop {

    private double temperature;
    private double humidity;
    private String cropType;
}
