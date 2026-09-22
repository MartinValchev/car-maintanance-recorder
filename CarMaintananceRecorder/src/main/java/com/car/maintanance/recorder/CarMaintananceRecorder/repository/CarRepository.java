package com.car.maintanance.recorder.CarMaintananceRecorder.repository;

import com.car.maintanance.recorder.CarMaintananceRecorder.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarRepository extends CrudRepository<Car, UUID> {
}
