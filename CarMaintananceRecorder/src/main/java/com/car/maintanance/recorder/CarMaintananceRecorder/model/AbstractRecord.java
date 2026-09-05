package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public abstract class AbstractRecord {
    private LocalDateTime createDate;
    private int currentMileage;
    private BigDecimal amount;
    private String currency;
    private String notes;

    protected abstract RecordType getRecordType();
}
