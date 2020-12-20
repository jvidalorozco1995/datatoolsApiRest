package com.org.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.data.models.BaseResponse;
import com.org.data.models.ConductoresDto;
import com.org.data.models.EmpresasDto;
import com.org.data.repositories.ConductoresRepository;
import com.org.data.repositories.EmpresasRepository;

@Service
public class ConductoresService implements IConductoresService {

    @Autowired
    private ConductoresRepository repository;

    @Override
    public List<ConductoresDto> findAll() {

        var cities = (List<ConductoresDto>) repository.findAll();

        return cities;
    }
    
   
    
    @Override
	public BaseResponse create(ConductoresDto conductor) {
	   BaseResponse base = new BaseResponse();
		try {
			
		   repository.save(conductor);
		   base.code = "1";
		   base.message = "Guardado Satisfactoriamente";
		   
			
		}catch(Exception ex) {
		   base.code = "0";
		    base.message = "Ha ocurrido un error al intentar guardar el registro, por favor intente mas tarde";
			   
		}
		return base; 
	}
}
