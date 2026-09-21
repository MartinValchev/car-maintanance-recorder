package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

//@Entity
@Getter
@Setter
public class FuelReport {

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

//    @ManyToOne
//    @JoinColumn(name = "car_id")
    private Car car;

//    @OneToMany(mappedBy = "fuelReport", cascade = CascadeType.ALL)
    private List<FuelRecord> records;
    private BigDecimal amount;
    private String currency;
}
