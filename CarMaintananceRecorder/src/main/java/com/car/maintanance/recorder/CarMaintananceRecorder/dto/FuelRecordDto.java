package com.car.maintanance.recorder.CarMaintananceRecorder.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FuelRecordDto {
    private String fuelType;
    private BigDecimal pricePerLitre;
    private long carId;
    private String recordType;
    private long fuelReportId;
}
