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
import com.org.data.models.VehiculosDto;
import com.org.data.models.VehiculosPorConductorDto;
import com.org.data.services.VehiculosPorConductorService;
import com.org.data.services.VehiculosService;

@RestController()
@RequestMapping("/api/vehiculosconductores")
@CrossOrigin
public class VehiculosPorConductorController {

	@Autowired
    private VehiculosPorConductorService vehiculosconductoresService;

    @GetMapping("")
    public List<VehiculosPorConductorDto> getVehiculos() {

    	List<VehiculosPorConductorDto> lstVehiculos = (	List<VehiculosPorConductorDto>) vehiculosconductoresService.obtenerVehiculosPorConductor();

        return lstVehiculos;
    }
    
  
}
