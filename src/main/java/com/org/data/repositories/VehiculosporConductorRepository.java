package com.org.data.repositories;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.org.data.models.BaseResponse;
import com.org.data.models.VehiculosPorConductorDto;

public interface VehiculosporConductorRepository extends Repository<VehiculosPorConductorDto, String> {

	 @Query(value = "SELECT veco.id as id,veh.placa as placa,emp.tipodocumento as tipodocumento,emp.numerodocumento as numerodocumento, emp.nombre as empresa,c.nombres as nombres,veco.idvehiculo,veco.idconductor FROM public.vehiculosporconductor veco INNER JOIN conductores c ON c.id = veco.idconductor INNER JOIN vehiculos veh ON veh.id = veco.idvehiculo INNER JOIN empresas emp ON  emp.id = CAST (idEmpresa AS UUID) WHERE veco.idvehiculo IN (SELECT idvehiculo FROM vehiculosporconductor GROUP BY idvehiculo HAVING COUNT(*)>1)", nativeQuery = true)
		List<VehiculosPorConductorDto> obtenerVehiculosPorConductor();
	 

}
