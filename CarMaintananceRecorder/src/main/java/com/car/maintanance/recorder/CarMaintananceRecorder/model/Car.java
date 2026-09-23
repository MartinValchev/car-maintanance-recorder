package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private long carId;
    private String make;
    private String model;
    private String vin;
    private int mileage;
    private CarType type;
    private FuelType fuelType;
    private LocalDateTime insertDate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private CarOwner owner;
}
