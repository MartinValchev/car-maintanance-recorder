package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class CarOwner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private long ownerId;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private LocalDateTime insertDate;
    private LocalDateTime modifiedDate;
}
