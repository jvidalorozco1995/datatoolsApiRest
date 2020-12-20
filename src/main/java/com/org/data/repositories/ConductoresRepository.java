package com.org.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.data.models.ConductoresDto;
import com.org.data.models.EmpresasDto;

@Repository
public interface ConductoresRepository extends CrudRepository<ConductoresDto, Long> {

}
