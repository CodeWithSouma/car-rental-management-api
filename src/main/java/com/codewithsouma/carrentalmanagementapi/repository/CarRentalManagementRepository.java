package com.codewithsouma.carrentalmanagementapi.repository;

import com.codewithsouma.carrentalmanagementapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalManagementRepository extends JpaRepository<Car,Long> {
}
