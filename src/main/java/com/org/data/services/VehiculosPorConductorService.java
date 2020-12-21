package com.org.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.data.models.AsignarVehiculosDto;
import com.org.data.models.BaseResponse;
import com.org.data.models.EmpresasDto;
import com.org.data.models.VehiculosDto;
import com.org.data.models.VehiculosPorConductorDto;
import com.org.data.repositories.VehiculosAsignadosRepository;
import com.org.data.repositories.VehiculosRepository;
import com.org.data.repositories.VehiculosporConductorRepository;

@Service()
public class VehiculosPorConductorService implements IVehiculosPorConductorService {

    @Autowired
    private VehiculosporConductorRepository repository;

    @Autowired
    private VehiculosAsignadosRepository repositoryAsignados;

  
	@Override
	public 	List<VehiculosPorConductorDto> obtenerVehiculosPorConductor() {
		List<VehiculosPorConductorDto> cities = (	List<VehiculosPorConductorDto>) repository.obtenerVehiculosPorConductor();

        return cities;
	}


	@Override
	public BaseResponse create(AsignarVehiculosDto vehi) {
	   BaseResponse base = new BaseResponse();
		try {
			
			repositoryAsignados.save(vehi);
		   base.code = "1";
		   base.message = "Guardado satisfactoriamente";
		   
			
		}catch(Exception ex) {
		   base.code = "0";
		    base.message = ex.getMessage();
			   
		}
		return base; 
	}
	
}


