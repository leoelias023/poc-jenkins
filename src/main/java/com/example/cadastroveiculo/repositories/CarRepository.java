package com.example.cadastroveiculo.repositories;

import com.example.cadastroveiculo.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
