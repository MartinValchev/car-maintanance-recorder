package com.car.maintanance.recorder.CarMaintananceRecorder.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class FuelReportDto {
    private long fuelReportId;
    private String fuelType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CardDto cardDto;
    private List<FuelRecordDto> records;
    private BigDecimal amount;
    private String currency;
}
