package com.mdomaradzki.carshowroomrestapp.controllers;

import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.api.model.OwnerDTO;
import com.mdomaradzki.carshowroomrestapp.services.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/owners/")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @GetMapping("{id}")
    public ResponseEntity<OwnerDTO> getOwnerById(@PathVariable Long id){
        return new ResponseEntity<OwnerDTO>(ownerService.getOwnerById(id), HttpStatus.OK);
    }

}
