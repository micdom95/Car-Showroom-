package com.mdomaradzki.carshowroomrestapp.services;

import com.mdomaradzki.carshowroomrestapp.api.mapper.CarMapper;
import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;
import com.mdomaradzki.carshowroomrestapp.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    CarRepository carRepository;
    CarMapper carMapper;

    public CarServiceImpl(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }
    //GET
    @Override
    public List<CarDTO> getAllCars() {
        return carRepository.findAll().stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }

    @Override
    public CarDTO getCarById(Long Id) {
        return carMapper.carToCarDTO(carRepository.findById(Id).get());
    }

    @Override
    public List<CarDTO> getCarByStatus(String status) {
        return carRepository.findByStatus(status).stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarByCarBrand(String carBrand) {
        return carRepository.findByCarBrand(carBrand).stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarByModelOfCar(String modelOfCar) {
        return carRepository.findByModelOfCar(modelOfCar).stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarByGearbox(String gearbox) {
        return carRepository.findByGearbox(gearbox).stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarByYearOfProduction(int yearProduction) {
        return carRepository.findByYearProduction(yearProduction).stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getCarByMileage(int mileage) {
        return carRepository.findByMileage(mileage).stream().map(carMapper::carToCarDTO).collect(Collectors.toList());
    }
    //CREATE
    @Override
     public CarDTO createNewCar(CarDTO carDTO) {
        Car car = carMapper.carDTOtoCar(carDTO);
        Car savedCar = carRepository.save(car);
        return carMapper.carToCarDTO(savedCar);
    }
    //PUT
    @Override
    public CarDTO updateCar(Long id,CarDTO carDTO) {
       Car car = carMapper.carDTOtoCar(carDTO);
       car.setId(id);
       Car savedCar = carRepository.save(car);
       return carMapper.carToCarDTO(savedCar);
    }
    //DELETE
    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }
}
