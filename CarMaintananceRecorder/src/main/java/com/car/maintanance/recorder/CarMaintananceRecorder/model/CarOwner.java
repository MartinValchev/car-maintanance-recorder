package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
//@Entity
public class CarOwner {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
}
