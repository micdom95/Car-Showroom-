package com.mdomaradzki.carshowroomrestapp.bootstrap;

import com.mdomaradzki.carshowroomrestapp.domain.Car;
import com.mdomaradzki.carshowroomrestapp.domain.Owner;
import com.mdomaradzki.carshowroomrestapp.repositories.CarRepository;
import com.mdomaradzki.carshowroomrestapp.repositories.OwnersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataLoader implements CommandLineRunner {

    CarRepository carRepository;
    OwnersRepository ownersRepository;

    public DBDataLoader(CarRepository carRepository, OwnersRepository ownersRepository) {
        this.carRepository = carRepository;
        this.ownersRepository = ownersRepository;
    }


    @Override
    public void run(String... args) throws Exception {

    Car car1 = new Car();
    car1.setCarBrand("BMW");
    car1.setModelOfCar("M4");
    car1.setGearbox("Automatic");
    car1.setYearProduction(2018);
    car1.setMileage(32000);
    car1.setStatus("Available");

    Car car2 = new Car();
    car2.setCarBrand("Chevrolet");
    car2.setModelOfCar("Corvette_C6");
    car2.setGearbox("Automatic");
    car2.setYearProduction(2011);
    car2.setMileage(68000);
    car2.setStatus("Available");

    Car car3 = new Car();
    car3.setCarBrand("Chevrolet");
    car3.setModelOfCar("Corvette_C7");
    car3.setGearbox("Automatic");
    car3.setYearProduction(2019);
    car3.setMileage(42000);
    car3.setStatus("Available");

    Car car4 = new Car();
    car4.setCarBrand("Chevrolet");
    car4.setModelOfCar("Corvette_C8");
    car4.setGearbox("Automatic");
    car4.setYearProduction(2020);
    car4.setMileage(6000);
    car4.setStatus("Available");

    Car car5 = new Car();
    car5.setCarBrand("Ferrari");
    car5.setModelOfCar("488");
    car5.setGearbox("Automatic");
    car5.setYearProduction(2019);
    car5.setMileage(6800);
    car5.setStatus("Available");

    Car car6 = new Car();
    car6.setCarBrand("Mercedes-Benz");
    car6.setModelOfCar("AMG-GTR");
    car6.setGearbox("Automatic");
    car6.setYearProduction(2019);
    car6.setMileage(12000);
    car6.setStatus("Available");

    Owner owner1 = new Owner();
    owner1.setNameOfOwner("Michał");
    owner1.setSurnameOfOwner("Nowak");
    owner1.addCarToOwner(car1);

    Owner owner2 = new Owner();
    owner2.setNameOfOwner("Krzysztof");
    owner2.setSurnameOfOwner("Nowak");
    owner2.addCarToOwner(car2);

    Owner owner3 = new Owner();
    owner3.setNameOfOwner("Mateusz");
    owner3.setSurnameOfOwner("Nowak");
    owner3.addCarToOwner(car3);

    Owner owner4 = new Owner();
    owner4.setNameOfOwner("Andrzej");
    owner4.setSurnameOfOwner("Nowak");
    owner4.addCarToOwner(car4);

    Owner owner5 = new Owner();
    owner5.setNameOfOwner("Piotr");
    owner5.setSurnameOfOwner("Nowak");
    owner5.addCarToOwner(car5);

    Owner owner6 = new Owner();
    owner6.setNameOfOwner("Paweł");
    owner6.setSurnameOfOwner("Nowak");
    owner6.addCarToOwner(car6);


    carRepository.save(car1);
    carRepository.save(car2);
    carRepository.save(car3);
    carRepository.save(car4);
    carRepository.save(car5);
    carRepository.save(car6);

    ownersRepository.save(owner1);
    ownersRepository.save(owner2);
    ownersRepository.save(owner3);
    ownersRepository.save(owner4);
    ownersRepository.save(owner5);
    ownersRepository.save(owner6);

    System.out.println("Data loaded to Car Repository!");
    System.out.println("Data loaded to Owners Repository");
    System.out.println("Data loaded to DB!");
    }
}
