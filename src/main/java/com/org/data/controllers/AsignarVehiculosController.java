package com.org.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.data.models.AsignarVehiculosDto;
import com.org.data.models.BaseResponse;
import com.org.data.models.ConductoresDto;
import com.org.data.services.ConductoresService;
import com.org.data.services.VehiculosPorConductorService;


@RestController()

@CrossOrigin
public class AsignarVehiculosController {

	@Autowired
    public VehiculosPorConductorService cservice;

 
    @PostMapping("/api/asignarVehiculos")
    public BaseResponse newConductor(@RequestBody AsignarVehiculosDto conductor) {
    	 BaseResponse response = new BaseResponse();
        if(conductor != null) {
        	return cservice.create(conductor);
        	
        } else {
        	
        	response.code = "0";
        	response.message = "Los campos estan vacios";
            return response; 
        }
    }
    
    @PostMapping("/api/desaFiliarVehiculos")
    public BaseResponse desaFiliarVehiculo(@RequestBody AsignarVehiculosDto conductor) {
    	 BaseResponse response = new BaseResponse();
        if(conductor != null) {
        	return cservice.desaFiliarVehiculo(conductor);
        	
        } else {
        	
        	response.code = "0";
        	response.message = "Los campos estan vacios";
            return response; 
        }
    }

}
