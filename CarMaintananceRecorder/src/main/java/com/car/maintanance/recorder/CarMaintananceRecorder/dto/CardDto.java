package com.car.maintanance.recorder.CarMaintananceRecorder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CardDto {

    private long carId;
    private String make;
    private String model;
    private String vin;
    private int mileage;
    private String type;
    private String fuelType;
    private long ownerId;
}
