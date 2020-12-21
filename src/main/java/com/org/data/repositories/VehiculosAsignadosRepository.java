package com.org.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.data.models.AsignarVehiculosDto;
import com.org.data.models.VehiculosPorConductorDto;

@Repository
public interface VehiculosAsignadosRepository extends CrudRepository<AsignarVehiculosDto, Long> {

	 
}
