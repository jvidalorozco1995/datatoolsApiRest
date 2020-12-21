package com.org.data.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculos")
public class VehiculosDto {

   public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public String getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(String pasajeros) {
		this.pasajeros = pasajeros;
	}
	public int getCantSentados() {
		return cantSentados;
	}
	public void setCantSentados(int cantSentados) {
		this.cantSentados = cantSentados;
	}
	public int getCantPies() {
		return cantPies;
	}
	public void setCantPies(int cantPies) {
		this.cantPies = cantPies;
	}
	public String getPesoSeco() {
		return pesoSeco;
	}
	public void setPesoSeco(String pesoSeco) {
		this.pesoSeco = pesoSeco;
	}
	public String getPesobruto() {
		return pesobruto;
	}
	public void setPesobruto(String pesobruto) {
		this.pesobruto = pesobruto;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
  private String placa;
  private String motor;
  private String chasis;
  private String modelo;
  private String fechaMatricula;
  private String pasajeros;
  private int cantSentados;
  private int cantPies;
  private String pesoSeco;
  private String pesobruto;
  private int cantPuertas;
  private String marca;
  private String linea;
  private Long idEmpresa;
  public Long getIdEmpresa() {
	return idEmpresa;
}
public void setIdEmpresa(Long idEmpresa) {
	this.idEmpresa = idEmpresa;
}
	
}
