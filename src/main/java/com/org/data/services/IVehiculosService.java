package com.org.data.services;

import java.util.List;

import com.org.data.models.BaseResponse;
import com.org.data.models.EmpresasDto;
import com.org.data.models.VehiculosDto;



public interface IVehiculosService {
	List<VehiculosDto> findAll();
	BaseResponse create(VehiculosDto vehiculo);
}
