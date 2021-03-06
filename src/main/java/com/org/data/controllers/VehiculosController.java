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
import com.org.data.models.EmpresasDto;
import com.org.data.models.VehiculosDto;
import com.org.data.services.EmpresasService;
import com.org.data.services.VehiculosService;

@RestController()
@RequestMapping("/api/vehiculos")
@CrossOrigin
public class VehiculosController {

	@Autowired
    private VehiculosService vehiculosService;

    @GetMapping("")
    public List<VehiculosDto> getVehiculos() {

    	List<VehiculosDto> lstVehiculos = (List<VehiculosDto>) vehiculosService.findAll();

        return lstVehiculos;
    }
    
    @PostMapping("")
    public BaseResponse newVehiculo(@RequestBody VehiculosDto vehiculo) {
    	 BaseResponse response = new BaseResponse();
        if(vehiculo != null) {
        	return vehiculosService.create(vehiculo);
        	
        } else {
        	
        	response.code = "0";
        	response.message = "Los campos estan vacios";
            return response; 
        }
    }
}
