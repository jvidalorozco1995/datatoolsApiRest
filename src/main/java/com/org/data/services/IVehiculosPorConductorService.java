package com.org.data.services;

import java.util.List;

import com.org.data.models.AsignarVehiculosDto;
import com.org.data.models.BaseResponse;
import com.org.data.models.VehiculosPorConductorDto;

public interface IVehiculosPorConductorService {
	List<VehiculosPorConductorDto> obtenerVehiculosPorConductor();
	BaseResponse create(AsignarVehiculosDto vehi);
}
