package com.mdomaradzki.carshowroomrestapp.repositories;

import com.mdomaradzki.carshowroomrestapp.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {

    List<Car> findByCarBrand(String carBrand);
    List<Car> findByModelOfCar(String modelOfCar);
    List<Car> findByGearbox(String gearbox);
    List<Car> findByYearProduction(int yearProduction);
    List<Car> findByMileage(int mileage);
    List<Car> findByStatus(String status);
}
