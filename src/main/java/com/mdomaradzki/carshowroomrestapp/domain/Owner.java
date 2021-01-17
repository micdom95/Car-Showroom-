package com.mdomaradzki.carshowroomrestapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Owner {

    public Owner()
    {
        cars = new ArrayList<>();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameOfOwner;
    private String surnameOfOwner;
    @OneToMany(mappedBy = "owner")
    //Can't initialize a new ArrayList!
    private List<Car> cars; //Check solution for this line

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

    public String getSurnameOfOwner() {
        return surnameOfOwner;
    }

    public void setSurnameOfOwner(String surnameOfOwner) {
        this.surnameOfOwner = surnameOfOwner;
    }

    public List<Car> getCars() { return cars; }

    public void setCars(List<Car> cars) { this.cars = cars; }

    public void addCarToOwner(Car car) { cars.add(car); }
}
