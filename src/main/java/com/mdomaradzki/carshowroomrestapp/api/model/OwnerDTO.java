package com.mdomaradzki.carshowroomrestapp.api.model;

import com.mdomaradzki.carshowroomrestapp.domain.Car;

import java.util.List;

public class OwnerDTO {
    private Long id;
    private String nameOfOwner;
    private String surnameOfOwner;
    private List<CarDTO> carsDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getSurnameOfOwner() { return surnameOfOwner; }

    public void setSurnameOfOwner(String surnameOfOwner) {
        this.surnameOfOwner = surnameOfOwner;
    }

    public List<CarDTO> getCarsDTO() { return carsDTO; }

    public void setCarsDTO(List<CarDTO> carsDTO) { this.carsDTO = carsDTO; }
}
