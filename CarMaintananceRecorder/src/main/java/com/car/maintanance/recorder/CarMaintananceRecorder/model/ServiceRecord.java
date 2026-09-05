package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class ServiceRecord extends AbstractRecord {
    @Override
    protected RecordType getRecordType() {
        return RecordType.SERVICE;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String serviceType;
}
