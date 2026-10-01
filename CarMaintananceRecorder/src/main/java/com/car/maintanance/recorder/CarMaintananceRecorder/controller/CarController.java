package com.car.maintanance.recorder.CarMaintananceRecorder.controller;

import com.car.maintanance.recorder.CarMaintananceRecorder.dto.CardDto;
import com.car.maintanance.recorder.CarMaintananceRecorder.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private static final Logger logger = LoggerFactory.getLogger(CarController.class);


    @Autowired
    private CarService carService;

    @GetMapping("/cars/{id}")
    public CardDto getCarById(@PathVariable("id") long id) {
        logger.info("Get car by id: {}", id);
        return carService.getCarById(id);
    }

    @GetMapping("/cars")
    public List<CardDto> getAllCars() {
        logger.info("Getting all cars ...");
        return carService.getAllCars();
    }
}
