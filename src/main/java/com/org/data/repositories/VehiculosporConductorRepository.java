package com.org.data.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import com.org.data.models.VehiculosPorConductorDto;

public interface VehiculosporConductorRepository extends Repository<VehiculosPorConductorDto, String> {

	 @Query(value = "SELECT veco.id as id,veh.placa as placa,emp.tipo_documento as tipodocumento,emp.numero_documento as numerodocumento, emp.nombre as empresa,c.nombres as nombres FROM public.vehiculosporconductor veco INNER JOIN conductores c ON c.id = veco.idconductor INNER JOIN vehiculos veh ON veh.id = veco.idvehiculo INNER JOIN empresas emp ON  emp.id = CAST (idEmpresa AS UUID) WHERE veco.idvehiculo IN (SELECT idvehiculo FROM vehiculosporconductor GROUP BY idvehiculo HAVING COUNT(*)>1)", nativeQuery = true)
		List<VehiculosPorConductorDto> obtenerVehiculosPorConductor();
	 
	 
}
