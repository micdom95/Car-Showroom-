package com.mdomaradzki.carshowroomrestapp.services;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.api.model.OwnerDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;

import java.util.List;

public interface OwnerService {

    //GET
    OwnerDTO getOwnerById(Long id);
    List<OwnerDTO> getAllOwners();
    List<OwnerDTO> getOwnerByName(String nameOfOwner);
    List<OwnerDTO> getOwnerBySurname(String surnameOfOwner);
    List<CarDTO> getAllCarsByOwner(Long ownerId);
    //CREATE
    OwnerDTO createNewOwner(OwnerDTO ownerDTO);
    //PUT
    OwnerDTO updateOwner(Long id,OwnerDTO ownerDTO);
    //DELETE
    void deleteOwnerById(Long id);
}
