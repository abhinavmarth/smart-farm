package com.smartfarm.sensor_service.controller;

import com.smartfarm.sensor_service.model.Sensor;
import com.smartfarm.sensor_service.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @Autowired
    private SensorService service;

    @PostMapping
    public Sensor addSensor(@RequestBody Sensor sensor){
        return service.saveSensor(sensor);
    }

    @GetMapping
    public List<Sensor> getAllSensor(){
        return service.getAllData();
    }
}
