package com.org.data.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.data.models.BaseResponse;
import com.org.data.models.EmpresasDto;
import com.org.data.repositories.EmpresasRepository;

@Service()
public class EmpresasService implements IEmpresasService {

    @Autowired
    private EmpresasRepository repository;

    @Override
    public List<EmpresasDto> findAll() {

    	List<EmpresasDto> cities = (List<EmpresasDto>) repository.findAll();

        return cities;
    }

	@Override
	public BaseResponse create(EmpresasDto empresa) {
	   BaseResponse base = new BaseResponse();
		try {
			
		   repository.save(empresa);
		   base.code = "1";
		   base.message = "Guardado satisfactoriamente";
		   
			
		}catch(Exception ex) {
		   base.code = "0";
		    base.message = ex.getMessage();
			   
		}
		return base; 
	}
}
