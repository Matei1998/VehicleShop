package com.example.VehicleShop.repository;

import com.example.VehicleShop.entity.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository<Cars,Long> {

}
