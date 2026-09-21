package com.car.maintanance.recorder.CarMaintananceRecorder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CarMaintananceRecorderApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void thisPassed() {
		assertEquals(1, 1, "Fixed");
	}

	// Break it again - change PipelineTest.java
	@Test
	void thisFails() {
		assertEquals(1, 2, "broken again");
	}
}
