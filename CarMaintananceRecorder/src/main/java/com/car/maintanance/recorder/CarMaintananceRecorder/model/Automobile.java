package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Automobile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String make;
    private String model;
    private String vin;
    private int mileage;
    private AutomobileType type;
    private LocalDateTime insertDate;

    @ManyToOne
    private AutomobileOwner owner;
}
