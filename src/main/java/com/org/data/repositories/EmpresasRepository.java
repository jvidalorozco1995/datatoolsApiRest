package com.org.data.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.data.models.EmpresasDto;

@Repository
public interface EmpresasRepository extends CrudRepository<EmpresasDto, Long> {

}