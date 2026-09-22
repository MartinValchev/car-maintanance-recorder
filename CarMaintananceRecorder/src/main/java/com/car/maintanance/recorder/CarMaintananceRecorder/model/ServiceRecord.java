package com.car.maintanance.recorder.CarMaintananceRecorder.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
//@Entity
public class ServiceRecord extends AbstractRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String serviceType;

//    @ManyToOne
//    @JoinColumn(name = "car_id")
    private Car car;

//    @ManyToOne
//    @JoinColumn(name = "service_report_id")
    private ServiceReport serviceReport;

    @Override
    protected RecordType getRecordType() {
        return RecordType.SERVICE;
    }
}
