package com.org.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.data.models.BaseResponse;
import com.org.data.models.ConductoresDto;

import com.org.data.services.ConductoresService;
import com.org.data.services.EmpresasService;

@RestController()
@RequestMapping("/api/conductores")
@CrossOrigin
public class ConductoresController {

	@Autowired
    public ConductoresService cservice;

    @GetMapping("")
    public List<ConductoresDto> getConductores() {

    	List<ConductoresDto> lstEmpresas = (List<ConductoresDto>) cservice.findAll();

        return lstEmpresas;
    }
    
    @PostMapping("")
    public BaseResponse newConductor(@RequestBody ConductoresDto conductor) {
    	 BaseResponse response = new BaseResponse();
        if(conductor != null) {
        	return cservice.create(conductor);
        	
        } else {
        	
        	response.code = "0";
        	response.message = "Los campos estan vacios";
            return response; 
        }
    }
}
