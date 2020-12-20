package com.org.data.services;

import java.util.List;

import com.org.data.models.BaseResponse;
import com.org.data.models.ConductoresDto;


public interface IConductoresService {
	List<ConductoresDto> findAll();
	BaseResponse create(ConductoresDto conductor);
}
