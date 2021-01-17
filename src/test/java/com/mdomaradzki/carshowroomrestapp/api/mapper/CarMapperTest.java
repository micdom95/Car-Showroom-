package com.mdomaradzki.carshowroomrestapp.api.mapper;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {

    CarMapper carMapper = CarMapper.INSTANCE;
    @Test
    void carToCarDTO() {
        {
            //given
            Car car = new Car();
            car.setId(1L);
            car.setCarBrand("BMW");
            car.setModelOfCar("M4");
            car.setGearbox("automatic");
            car.setYearProduction(2015);
            car.setMileage(32000);
            car.setStatus("available");

            //when
            CarDTO carDTO = carMapper.carToCarDTO(car);

            //then
            assertEquals(Long.valueOf(1L),carDTO.getId());
            assertEquals("BMW",carDTO.getCarBrand());
            assertEquals("M4",carDTO.getModelOfCar());
            assertEquals("automatic",carDTO.getGearbox());
            assertEquals(2015,carDTO.getYearProduction());
            assertEquals(32000, carDTO.getMileage());
            assertEquals("available",carDTO.getStatus());

        }

    }
}