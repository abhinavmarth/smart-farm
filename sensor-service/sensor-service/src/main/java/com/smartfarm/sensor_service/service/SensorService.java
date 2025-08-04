package com.smartfarm.sensor_service.service;

import com.netflix.discovery.converters.Auto;
import com.smartfarm.sensor_service.model.Sensor;
import com.smartfarm.sensor_service.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    public Sensor saveSensor(Sensor sensor){
        return sensorRepository.save(sensor);
    }

    public List<Sensor> getAllData(){
        return sensorRepository.findAll();
    }
}
