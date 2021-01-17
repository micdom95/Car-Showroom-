package com.mdomaradzki.carshowroomrestapp.controllers;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.api.model.CarListDTO;
import com.mdomaradzki.carshowroomrestapp.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@Controller
@RequestMapping("api/cars/")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    //GET
    @GetMapping
    public ResponseEntity<CarListDTO> getAllCars() {
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getAllCars()), HttpStatus.OK
        );
    }
    @GetMapping("{id}")
    public ResponseEntity<CarDTO> getCarById(@PathVariable Long id){
        return new ResponseEntity<CarDTO>(carService.getCarById(id),HttpStatus.OK);
    }
    @GetMapping("Status")
    public ResponseEntity<CarListDTO> getCarByStatus(@RequestParam String status){
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getCarByStatus(status)), HttpStatus.OK
        );
    }
    @GetMapping("CarBrand")
    public ResponseEntity<CarListDTO> getCarByCarBrand(@RequestParam String carBrand){
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getCarByCarBrand(carBrand)), HttpStatus.OK
        );
    }
    @GetMapping("ModelOfCar")
    public ResponseEntity<CarListDTO> getCarByModelOfCar(@RequestParam String modelOfCar){
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getCarByModelOfCar(modelOfCar)), HttpStatus.OK
        );
    }
    @GetMapping("Gearbox")
    public ResponseEntity<CarListDTO> getCarByGearbox(@RequestParam String gearbox){
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getCarByGearbox(gearbox)), HttpStatus.OK
        );
    }
    @GetMapping("YearOfProduction")
    public ResponseEntity<CarListDTO> getCarByYearOfProduction(@RequestParam int yearProduction){
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getCarByYearOfProduction(yearProduction)), HttpStatus.OK
        );
    }
    @GetMapping("Mileage")
    public ResponseEntity<CarListDTO> getCarByMileage(@RequestParam int mileage){
        return new ResponseEntity<CarListDTO>(
                new CarListDTO(carService.getCarByMileage(mileage)), HttpStatus.OK
        );
    }
    //POST
    @PostMapping
    public ResponseEntity<CarDTO> createNewCar(@RequestBody CarDTO carDTO){
        return new ResponseEntity<CarDTO>(carService.createNewCar(carDTO), HttpStatus.CREATED);
    }
    //PUT
    @PutMapping("{id}")
    public ResponseEntity<CarDTO> updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO){
        return new ResponseEntity<CarDTO>(carService.updateCar(id, carDTO), HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id){
        carService.deleteCarById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
