package com.car.maintanance.recorder.CarMaintananceRecorder.controller;

import com.car.maintanance.recorder.CarMaintananceRecorder.dto.CardDto;
import com.car.maintanance.recorder.CarMaintananceRecorder.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars/{id}")
    public CardDto getCarById(@PathVariable("id") long id) {
        return carService.getCarById(id);
    }

    @GetMapping("/cars")
    public List<CardDto> getAllCars() {
        return carService.getAllCars();
    }
}
