package com.org.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.data.models.BaseResponse;
import com.org.data.models.ConductoresDto;
import com.org.data.repositories.ConductoresRepository;

@Service
public class ConductoresService implements IConductoresService {

    @Autowired
    private ConductoresRepository repository;

    @Override
    public List<ConductoresDto> findAll() {

    	 List<ConductoresDto> cities = (List<ConductoresDto>) repository.findAll();

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
		    base.message = ex.getMessage();
			   
		}
		return base; 
	}
}
