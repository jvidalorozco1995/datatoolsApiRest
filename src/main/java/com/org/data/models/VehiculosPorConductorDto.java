package com.org.data.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "VehiculosPorConductorDto")

public class VehiculosPorConductorDto {
    
	 public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	@Id
   private String id;
  
   public UUID getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(UUID idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public UUID getIdconductor() {
		return idconductor;
	}
	public void setIdconductor(UUID idconductor) {
		this.idconductor = idconductor;
	}
private UUID idvehiculo;
   private UUID idconductor;
   private String placa;
   private String tipodocumento;
   private String numerodocumento;
   private String empresa;
   private String nombres;
}

