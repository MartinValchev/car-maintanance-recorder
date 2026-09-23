package com.car.maintanance.recorder.CarMaintananceRecorder.service;

import com.car.maintanance.recorder.CarMaintananceRecorder.dto.FuelReportDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FuelReportService {

    public FuelReportDto generateFuelReport( LocalDateTime startDate, LocalDateTime endDate, long cardId) {
        return null;
    }
}
