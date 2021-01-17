package com.mdomaradzki.carshowroomrestapp.api.model;

import lombok.Data;

@Data
public class CarDTO {
    Long id;
    String carBrand;
    String modelOfCar;
    String gearbox;
    int yearProduction;
    int mileage;
    String status;


}
