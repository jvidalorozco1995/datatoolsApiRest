package com.org.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.data.models.BaseResponse;
import com.org.data.models.EmpresasDto;
import com.org.data.models.VehiculosDto;
import com.org.data.repositories.EmpresasRepository;
import com.org.data.repositories.VehiculosRepository;

@Service(value = "VehiculosService")
public class VehiculosService implements IVehiculosService {

    @Autowired
    private VehiculosRepository repository;

    @Override
    public List<VehiculosDto> findAll() {

        var cities = (List<VehiculosDto>) repository.findAll();

        return cities;
    }

	@Override
	public BaseResponse create(VehiculosDto vehiculo) {
		 BaseResponse base = new BaseResponse();
			try {
				
			   repository.save(vehiculo);
			   base.code = "1";
			   base.message = "Guardado satisfactoriamente";
			   
				
			}catch(Exception ex) {
			   base.code = "0";
			   base.message = "Ha ocurrido un error al intentar guardar el registro, por favor intente mas tarde";
				   
			}
			return base; 
	}
}

