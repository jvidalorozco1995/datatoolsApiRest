package com.org.data.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.org.data.models.VehiculosPorConductorDto;

//public interface VehiculosporConductorRepository extends CrudRepository<VehiculosPorConductorDto, Long> {
//
////	  @Transactional
////	  @Procedure(procedureName = "MOVE_TO_HISTORY")
////	  VehiculosPorConductorDto movePersonToHistory(@Param("idEmpresa") String idEmpresa);
//	}
