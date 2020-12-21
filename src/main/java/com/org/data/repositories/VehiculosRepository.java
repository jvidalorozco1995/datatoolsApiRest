package com.org.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.data.models.VehiculosDto;

@Repository
public interface VehiculosRepository extends CrudRepository<VehiculosDto, Long> {

}