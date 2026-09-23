package com.car.maintanance.recorder.CarMaintananceRecorder.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ServiceReportDto {
    private long serviceReportId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CardDto car;
    private List<ServiceRecordDto> records;
    private BigDecimal amount;
    private String currency;
}
