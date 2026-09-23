package com.car.maintanance.recorder.CarMaintananceRecorder.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ServiceRecordDto {

    private LocalDateTime createDate;
    private int currentMileage;
    private BigDecimal amount;
    private String currency;
    private String notes;
    private String serviceType;
    private long carId;
    private String recordType;
    private String serviceReportId;
}
