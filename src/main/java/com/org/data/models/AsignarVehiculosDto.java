package com.org.data.models;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculosporconductor")
public class AsignarVehiculosDto {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getIdVehiculo() {
		return idvehiculo;
	}
	public void setIdVehiculo(String idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public String getIdConductor() {
		return idconductor;
	}
	public void setIdConductor(String idconductor) {
		this.idconductor = idconductor;
	}
	private String idvehiculo;
	private String idconductor;
}
//todo
