package com.codewithsouma.carrentalmanagementapi.controller;

import com.codewithsouma.carrentalmanagementapi.entity.Car;
import com.codewithsouma.carrentalmanagementapi.service.CarRentalManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRentalManagementController {
    @Autowired
    private CarRentalManagementService service;

    @PostMapping("/saveCar")
    public Car addCar(@RequestBody Car car){
        return service.addCar(car);
    }

    @PutMapping("/editCar")
    public Car updateCar(@RequestParam long id, @RequestBody Car car){
        return service.updateCarById(id,car);
    }

    @DeleteMapping("/deleteCar")
    public String deleteCar(@RequestParam long id){
        return service.deleteCarById(id);
    }

    @GetMapping("/getCars")
    public List<Car> getAllCar(){
        return service.getAllCar();
    }

    @GetMapping("/getCar")
    public Car getCarById(@RequestParam long id){
        return service.getCarById(id);
    }

}
