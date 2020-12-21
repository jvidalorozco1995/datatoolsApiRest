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
	public UUID getIdVehiculo() {
		return idvehiculo;
	}
	public void setIdVehiculo(UUID idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public UUID getIdConductor() {
		return idconductor;
	}
	public void setIdConductor(UUID idconductor) {
		this.idconductor = idconductor;
	}
	private UUID idvehiculo;
	private UUID idconductor;
}
//todo
