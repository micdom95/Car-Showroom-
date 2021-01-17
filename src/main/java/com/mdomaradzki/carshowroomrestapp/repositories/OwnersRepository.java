package com.mdomaradzki.carshowroomrestapp.repositories;

import com.mdomaradzki.carshowroomrestapp.domain.Car;
import com.mdomaradzki.carshowroomrestapp.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnersRepository extends JpaRepository<Owner,Long> {


    List<Owner> findByNameOfOwner(String name);
    List<Owner> findBySurnameOfOwner(String surname);

}
