package com.mdomaradzki.carshowroomrestapp.services;

import com.mdomaradzki.carshowroomrestapp.api.mapper.CarMapper;
import com.mdomaradzki.carshowroomrestapp.api.mapper.OwnerMapper;
import com.mdomaradzki.carshowroomrestapp.api.model.CarDTO;
import com.mdomaradzki.carshowroomrestapp.api.model.OwnerDTO;
import com.mdomaradzki.carshowroomrestapp.domain.Car;
import com.mdomaradzki.carshowroomrestapp.domain.Owner;
import com.mdomaradzki.carshowroomrestapp.repositories.OwnersRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class OwnerServiceImpl implements OwnerService {
    OwnersRepository ownersRepository;
    OwnerMapper ownerMapper;
    CarMapper carMapper;

    public OwnerServiceImpl(OwnersRepository ownersRepository, OwnerMapper ownerMapper, CarMapper carMapper) {
        this.ownersRepository = ownersRepository;
        this.ownerMapper = ownerMapper;
        this.carMapper = carMapper;
    }
    //GET
    @Override
    public OwnerDTO getOwnerById(Long id) {
        return ownerMapper.ownerToOwnerDTO(ownersRepository.findById(id).get());
    }

    @Override
    public List<OwnerDTO> getAllOwners() {
        return ownersRepository.findAll().stream().map(ownerMapper::ownerToOwnerDTO).collect(Collectors.toList());
    }

    @Override
    public List<OwnerDTO> getOwnerByName(String nameOfOwner) {
        return ownersRepository.findByNameOfOwner(nameOfOwner).stream().map(ownerMapper::ownerToOwnerDTO).collect(Collectors.toList());
    }

    @Override
    public List<OwnerDTO> getOwnerBySurname(String surnameOfOwner) {
        return ownersRepository.findBySurnameOfOwner(surnameOfOwner).stream().map(ownerMapper::ownerToOwnerDTO).collect(Collectors.toList());
    }

    @Override
    public List<CarDTO> getAllCarsByOwner(Long ownerId) {
        return ownersRepository.findById(ownerId)
                .get()
                .getCars()
                .stream()
                .map(carMapper::carToCarDTO)
                .collect(Collectors.toList());
    }
    //CREATE
    @Override
    public OwnerDTO createNewOwner(OwnerDTO ownerDTO) {
        Owner owner = ownerMapper.ownerDTOtoOwner(ownerDTO);
        Owner savedOwner = ownersRepository.save(owner);
        return ownerMapper.ownerToOwnerDTO(savedOwner);
    }
    //PUT
    @Override
    public OwnerDTO updateOwner(Long id,OwnerDTO ownerDTO) {
        Owner owner = ownerMapper.ownerDTOtoOwner(ownerDTO);
        owner.setId(id);
        Owner savedOwner = ownersRepository.save(owner);
        return ownerMapper.ownerToOwnerDTO(savedOwner);
    }
    //DELETE
    @Override
    public void deleteOwnerById(Long id) {
        ownersRepository.deleteById(id);
    }
}
