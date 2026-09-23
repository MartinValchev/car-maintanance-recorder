package com.car.maintanance.recorder.CarMaintananceRecorder;


import com.car.maintanance.recorder.CarMaintananceRecorder.controller.CarController;
import com.car.maintanance.recorder.CarMaintananceRecorder.dto.CardDto;
import com.car.maintanance.recorder.CarMaintananceRecorder.service.CarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Plain Mockito unit tests for CarController.
 *
 * These tests call the controller methods directly (no Spring context,
 * no HTTP layer) and verify that the controller correctly delegates to
 * CarService and returns whatever the service provides.
 *
 * Adjust the package paths for CardDto / CarService above if they live
 * elsewhere in your project.
 */
@ExtendWith(MockitoExtension.class)
class CarControllerTest {

    @Mock
    private CarService carService;

    @InjectMocks
    private CarController carController;

    private CardDto sampleCar;

    @BeforeEach
    void setUp() {
        sampleCar = new CardDto(   1, "Honda", "Civic", "DV35544234776763", 120000, "Hatchback", "petrol", 1);
        // TODO: set sample fields on sampleCar here, e.g.:
        // sampleCar.setId(1L);
        // sampleCar.setMake("Toyota");
        // sampleCar.setModel("Corolla");
    }

    // ---------- getCarById ----------

    @Test
    void getCarById_returnsCarFromService_whenCarExists() {
        long carId = 1L;
        when(carService.getCarById(carId)).thenReturn(sampleCar);

        CardDto result = carController.getCarById(carId);

        assertThat(result).isEqualTo(sampleCar);
        verify(carService, times(1)).getCarById(carId);
    }

    @Test
    void getCarById_returnsNull_whenServiceReturnsNull() {
        long carId = 99L;
        when(carService.getCarById(carId)).thenReturn(null);

        CardDto result = carController.getCarById(carId);

        assertThat(result).isNull();
        verify(carService, times(1)).getCarById(carId);
    }

    @Test
    void getCarById_propagatesException_whenServiceThrows() {
        long carId = 42L;
        when(carService.getCarById(carId))
                .thenThrow(new RuntimeException("Car not found"));

        org.junit.jupiter.api.Assertions.assertThrows(
                RuntimeException.class,
                () -> carController.getCarById(carId)
        );
        verify(carService, times(1)).getCarById(carId);
    }

    // ---------- getAllCars ----------

    @Test
    void getAllCars_returnsListFromService() {
        CardDto secondCar = new CardDto(    4, "Mazda", "Cx5", "BV35544234776099", 160000, "SUV", "diesel", 5);
        List<CardDto> cars = List.of(sampleCar, secondCar);
        when(carService.getAllCars()).thenReturn(cars);

        List<CardDto> result = carController.getAllCars();

        assertThat(result).hasSize(2).containsExactly(sampleCar, secondCar);
        verify(carService, times(1)).getAllCars();
    }

    @Test
    void getAllCars_returnsEmptyList_whenNoCarsExist() {
        when(carService.getAllCars()).thenReturn(List.of());

        List<CardDto> result = carController.getAllCars();

        assertThat(result).isEmpty();
        verify(carService, times(1)).getAllCars();
    }
}
