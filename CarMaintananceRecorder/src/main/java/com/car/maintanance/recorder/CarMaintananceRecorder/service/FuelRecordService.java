package com.car.maintanance.recorder.CarMaintananceRecorder.service;

import com.car.maintanance.recorder.CarMaintananceRecorder.dto.FuelRecordDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuelRecordService {

    public long addFuelRecord(FuelRecordDto recordDto){
        return -1;
    }

    public FuelRecordDto getFuelRecordById(long recordId) {
        return null;
    }
    public long deleteFuelRecord(long recordId) {
        return -1;
    }

    public FuelRecordDto updateFuelRecord(FuelRecordDto cardDto) {
        return null;
    }

    public List<FuelRecordDto> getFuelRecordsByReportId(long reportId) {
        return null;
    }
}
