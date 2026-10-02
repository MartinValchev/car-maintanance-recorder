package com.car.maintanance.recorder.CarMaintananceRecorder.service;

import com.car.maintanance.recorder.CarMaintananceRecorder.dto.CarDto;
import com.car.maintanance.recorder.CarMaintananceRecorder.model.Car;
import com.car.maintanance.recorder.CarMaintananceRecorder.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CarService {
    private static final Logger logger = LoggerFactory.getLogger(CarService.class);

    @Autowired
    private CarRepository carRepository;

    List<CarDto> allCars = new ArrayList<>();

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
        CarDto hondaCivic = new CarDto(   1, "Honda", "Civic", "DV35544234776763", 120000, "Hatchback", "petrol", 1);
        CarDto mazdaCx5 = new CarDto(    4, "Mazda", "Cx5", "BV35544234776099", 160000, "SUV", "diesel", 5);
        CarDto subaruWRX = new CarDto(    6, "Subaru", "WRX", "DE355442347760994", 90000, "sedan", "petrol", 80);
        CarDto fordKa = new CarDto(    32,"Ford", "KA", "DE3554423477602244", 190000, "hatchback", "diesel", 7633);
        CarDto VWvan = new CarDto(    12, "VW", "Sharan", "DE3554423477212247", 230000, "miniVAN", "diesel", 1123);
        allCars.add(hondaCivic);
        allCars.add(mazdaCx5);
        allCars.add(subaruWRX);
        allCars.add(fordKa);
        allCars.add(VWvan);
    }

    public Long addCar(CarDto carDto){
        if (carDto == null ) {
            return null;
        }
        carRepository.save(fromCarDto(carDto));
        return carDto.getCarId();
    }

    public CarDto getCarById(long carId) {
        for (CarDto car : allCars) {
            if (car.getCarId() == carId) {
                return car;
            }
        }
        return null;
    }

    public long deleteCar(long carId) {
        CarDto carFound = null;
        for (CarDto car : allCars) {
            if (car.getCarId() == carId) {
                carFound = car;
                break;
            }
        }
        if (carFound != null) {
            allCars.remove(carFound);
        }
        return carId;
    }

    public List<CarDto> getAllCars() {
        List<CarDto> list = new ArrayList<>();
        for (Car car : carRepository.findAll()) {
            list.add(toCardDto(car));
        }
        return list;
    }

    public CarDto updateCar(CarDto carDto) {
        return null;
    }
    private CarDto toCardDto(Car car) {
        if (car == null) {
            return null;
        }
        return new CarDto(car.getCarId(), car.getMake(), car.getModel(), car.getVin(), car.getMileage(),
                car.getCarType(), car.getFuelType(), car.getOwnerId());
    }

    public Car fromCarDto(CarDto dto) {
        Car car = new Car();
        car.setCarId(dto.getCarId());
        car.setMake(dto.getMake());
        car.setCarType(dto.getType());
        car.setVin(dto.getVin());
        car.setModel(dto.getModel());
        car.setMileage(dto.getMileage());
        car.setInsertDate(LocalDateTime.now());
        car.setModifiedDate(LocalDateTime.now());
        car.setFuelType(dto.getFuelType());
        car.setOwnerId(dto.getOwnerId());
        return car;
    }
}
