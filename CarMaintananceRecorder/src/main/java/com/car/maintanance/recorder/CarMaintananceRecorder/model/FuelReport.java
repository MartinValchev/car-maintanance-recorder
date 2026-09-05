package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FuelReport {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @ManyToOne
    private Automobile automobile;
    private List<FuelRecord> records;
    private BigDecimal amount;
    private String currency;
}
