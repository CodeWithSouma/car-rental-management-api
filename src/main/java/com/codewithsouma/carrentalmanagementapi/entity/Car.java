package com.codewithsouma.carrentalmanagementapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "CAR_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private long carId;
    private String carModel;
    private String carNo;
    private String status;
}
