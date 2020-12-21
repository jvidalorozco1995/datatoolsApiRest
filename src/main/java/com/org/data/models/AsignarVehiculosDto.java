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
		return idVehiculo;
	}
	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}
	private String idVehiculo;
	private String idConductor;
}
//todo
