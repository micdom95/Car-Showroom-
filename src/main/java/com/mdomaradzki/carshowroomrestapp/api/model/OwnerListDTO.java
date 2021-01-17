package com.mdomaradzki.carshowroomrestapp.api.model;

import lombok.Data;

import java.util.List;

@Data
public class OwnerListDTO {

    private List<OwnerDTO> ownerList;

    public OwnerListDTO(List<OwnerDTO> ownerList) { this.ownerList = ownerList; }

    public List<OwnerDTO> getOwnerList() { return ownerList; }

    public void setOwnerList(List<OwnerDTO> ownerList) { this.ownerList = ownerList; }
}
