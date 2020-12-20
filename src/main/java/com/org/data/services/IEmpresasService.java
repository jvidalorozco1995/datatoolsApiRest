package com.org.data.services;

import java.util.List;

import com.org.data.models.BaseResponse;
import com.org.data.models.EmpresasDto;

public interface IEmpresasService {
	List<EmpresasDto> findAll();
	BaseResponse create(EmpresasDto empresa);
}
