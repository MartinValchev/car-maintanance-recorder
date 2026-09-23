package com.car.maintanance.recorder.CarMaintananceRecorder.service;

import com.car.maintanance.recorder.CarMaintananceRecorder.dto.CardDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CarService {

    List<CardDto> allCars = new ArrayList<>();

    public CarService() {
        CardDto hondaCivic = new CardDto(   1, "Honda", "Civic", "DV35544234776763", 120000, "Hatchback", "petrol", 1);
        CardDto mazdaCx5 = new CardDto(    4, "Mazda", "Cx5", "BV35544234776099", 160000, "SUV", "diesel", 5);
        CardDto subaruWRX = new CardDto(    6, "Subaru", "WRX", "DE355442347760994", 90000, "sedan", "petrol", 80);
        CardDto fordKa = new CardDto(    32,"Ford", "KA", "DE3554423477602244", 190000, "hatchback", "diesel", 7633);
        CardDto VWvan = new CardDto(    12, "VW", "Sharan", "DE3554423477212247", 230000, "miniVAN", "diesel", 1123);
        allCars.add(hondaCivic);
        allCars.add(mazdaCx5);
        allCars.add(subaruWRX);
        allCars.add(fordKa);
        allCars.add(VWvan);
    }

    public Long addCar(CardDto cardDto){
        if (cardDto == null ) {
            return null;
        }
        Random random = new Random(54000);
        long id = random.nextLong();
        cardDto.setCarId(id);
        allCars.add(cardDto);
        return id;
    }

    public CardDto getCarById(long carId) {
        for (CardDto car : allCars) {
            if (car.getCarId() == carId) {
                return car;
            }
        }
        return null;
    }

    public long deleteCar(long carId) {
        CardDto carFound = null;
        for (CardDto car : allCars) {
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

    public List<CardDto> getAllCars() {
        return allCars;
    }

    public CardDto updateCar(CardDto cardDto) {
        return null;
    }
}
