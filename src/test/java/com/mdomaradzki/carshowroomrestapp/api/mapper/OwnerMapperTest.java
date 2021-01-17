package com.mdomaradzki.carshowroomrestapp.api.mapper;

import com.mdomaradzki.carshowroomrestapp.api.model.OwnerDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;
import com.mdomaradzki.carshowroomrestapp.domain.Owner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerMapperTest {
    OwnerMapper ownerMapper = OwnerMapper.INSTANCE;
    @Test
    void ownerToOwnerDTO() {
        //given
        Car car = new Car();
        car.setId(1L);
        car.setCarBrand("BMW");
        car.setModelOfCar("M4");
        car.setGearbox("automatic");
        car.setYearProduction(2015);
        car.setMileage(32000);
        car.setStatus("available");

        Owner owner = new Owner();
        owner.setId(1L);
        owner.setNameOfOwner("Michał");
        owner.setSurnameOfOwner("Nowak");
        owner.addCarToOwner(car);

        //when
        OwnerDTO ownerDTO = ownerMapper.ownerToOwnerDTO(owner);
        //then
        assertEquals(Long.valueOf(1L),ownerDTO.getId());
        assertEquals("Michał",ownerDTO.getNameOfOwner());
        assertEquals("Nowak",ownerDTO.getSurnameOfOwner());

    }
}