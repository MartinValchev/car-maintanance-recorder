package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class FuelRecord extends AbstractRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private FuelType fuelType;
    private Double amount;
    private BigDecimal pricePerLitre;

    @Override
    protected RecordType getRecordType() {
        return RecordType.FUEL;
    }
}
