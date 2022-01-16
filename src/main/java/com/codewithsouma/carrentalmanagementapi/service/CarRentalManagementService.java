package com.codewithsouma.carrentalmanagementapi.service;

import com.codewithsouma.carrentalmanagementapi.entity.Car;
import com.codewithsouma.carrentalmanagementapi.repository.CarRentalManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRentalManagementService  {

    @Autowired
    private CarRentalManagementRepository repository;

    public Car addCar(Car car){
        return repository.save(car);
    }

    public Car updateCarById(long carId,Car newCarObject){
        Car existedCarObject = repository.findById(carId).orElse(null);
        existedCarObject.setCarModel(newCarObject.getCarModel());
        existedCarObject.setCarNo(newCarObject.getCarNo());
        existedCarObject.setStatus(newCarObject.getStatus());

        return repository.save(existedCarObject);
    }

    public String deleteCarById(long carId){
        repository.deleteById(carId);
        return "Successfully deleted car: "+carId;
    }

    public List<Car> getAllCar(){
        return repository.findAll();
    }

    public Car getCarById(long id){
        return repository.findById(id).orElse(null);
    }

}
