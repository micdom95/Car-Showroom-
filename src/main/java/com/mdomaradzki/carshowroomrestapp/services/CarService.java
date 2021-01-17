package com.mdomaradzki.carshowroomrestapp.services;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarService {

    //GET
    List<CarDTO> getAllCars();
    CarDTO getCarById(Long Id);
    List<CarDTO> getCarByStatus(String status);
    List<CarDTO> getCarByCarBrand(String carBrand);
    List<CarDTO> getCarByModelOfCar(String modelOfCar);
    List<CarDTO> getCarByGearbox(String gearbox);
    List<CarDTO> getCarByYearOfProduction(int yearOfProduction);
    List<CarDTO> getCarByMileage(int mileage);
    //CREATE
    CarDTO createNewCar(CarDTO carDTO);
    //PUT
    CarDTO updateCar(Long id,CarDTO carDTO);
    //DELETE
    void deleteCarById(Long id);
}

