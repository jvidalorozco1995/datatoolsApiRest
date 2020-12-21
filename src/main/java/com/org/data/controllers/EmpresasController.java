package com.org.data.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.data.models.EmpresasDto;
import com.org.data.models.BaseResponse;

import com.org.data.services.EmpresasService;



@RestController()
@RequestMapping("/api/empresas")
@CrossOrigin
public class EmpresasController {

	@Autowired
    private EmpresasService empresasService;

    @GetMapping("")
    public List<EmpresasDto> getEmpresas() {

    	List<EmpresasDto> lstEmpresas = (List<EmpresasDto>) empresasService.findAll();

        return lstEmpresas;
    }
    
    @PostMapping("")
    public BaseResponse newEmpresa(@RequestBody EmpresasDto empresa) {
    	 BaseResponse response = new BaseResponse();
        if(empresa != null) {
        	return empresasService.create(empresa);
        	
        } else {
        	
        	response.code = "0";
        	response.message = "Los campos estan vacios";
            return response; 
        }
    }
}
