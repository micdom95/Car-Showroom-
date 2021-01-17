package com.mdomaradzki.carshowroomrestapp.api.mapper;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.api.model.OwnerDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;
import com.mdomaradzki.carshowroomrestapp.domain.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(uses = {CarMapper.class}, componentModel = "spring")
public interface OwnerMapper {

    OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    @Mapping(source = "cars", target = "carsDTO")
    OwnerDTO ownerToOwnerDTO(Owner owner);

    @Mapping(source = "carsDTO", target = "cars")
    Owner ownerDTOtoOwner(OwnerDTO ownerDTO);

}
