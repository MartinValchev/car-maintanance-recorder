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
    private String carType;
    private String fuelType;
    private LocalDateTime insertDate;
    private LocalDateTime modifiedDate;

    @Column(name = "owner_id", unique = true, nullable = false)
    private long ownerId;
}
