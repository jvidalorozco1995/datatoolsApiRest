package com.org.data.repositories;

import java.util.UUID;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.data.models.BaseResponse;
import com.org.data.models.VehiculosDto;

@Repository
public interface VehiculosRepository extends CrudRepository<VehiculosDto, Long> {
	 
	 @Modifying
	 @Transactional
	 @Query(value = "delete from vehiculos where id = :id", nativeQuery = true)
	 int delete(@Param("id") UUID id);
}