package com.mdomaradzki.carshowroomrestapp.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class CarListDTO {

    private List<CarDTO> carList;

    public CarListDTO(List<CarDTO> carList) {
        this.carList = carList;
    }

    public List<CarDTO> getCarList() {
        return carList;
    }

    public void setCarList(List<CarDTO> carList) {
        this.carList = carList;
    }

}
