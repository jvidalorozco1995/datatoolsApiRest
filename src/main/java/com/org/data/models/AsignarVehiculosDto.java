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
	public void setIdVehiculo(String idVehiculo) {
		this.idvehiculo = idVehiculo;
	}
	public String getIdConductor() {
		return idconductor;
	}
	public void setIdConductor(String idConductor) {
		this.idconductor = idConductor;
	}
	private String idvehiculo;
	private String idconductor;
}
//todo
