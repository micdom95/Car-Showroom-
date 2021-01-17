package com.mdomaradzki.carshowroomrestapp.api.mapper;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDTO carToCarDTO(Car car);

    Car carDTOtoCar(CarDTO carDTO);

}
