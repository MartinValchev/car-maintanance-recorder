package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
//@Entity
public class FuelRecord extends AbstractRecord {

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private FuelType fuelType;
    private BigDecimal pricePerLitre;

//    @ManyToOne
//    @JoinColumn(name = "car_id")
    private Car car;

    @Override
    protected RecordType getRecordType() {
        return RecordType.FUEL;
    }

//    @ManyToOne
//    @JoinColumn(name = "fuel_report_id")
    private FuelReport fuelReport;
}
