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



public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
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
	public String getFechamatricula() {
		return fechamatricula;
	}
	public void setFechamatricula(String fechamatricula) {
		this.fechamatricula = fechamatricula;
	}
	public String getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(String pasajeros) {
		this.pasajeros = pasajeros;
	}
	public String getCantsentados() {
		return cantsentados;
	}
	public void setCantsentados(String cantsentados) {
		this.cantsentados = cantsentados;
	}
	public String getCantpies() {
		return cantpies;
	}
	public void setCantpies(String cantpies) {
		this.cantpies = cantpies;
	}
	public String getPesoseco() {
		return pesoseco;
	}
	public void setPesoseco(String pesoseco) {
		this.pesoseco = pesoseco;
	}
	public String getPesobruto() {
		return pesobruto;
	}
	public void setPesobruto(String pesobruto) {
		this.pesobruto = pesobruto;
	}
	public String getCantpuertas() {
		return cantpuertas;
	}
	public void setCantpuertas(String cantpuertas) {
		this.cantpuertas = cantpuertas;
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
	public UUID getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(UUID idempresa) {
		this.idempresa = idempresa;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
	  private String placa;
private String motor;
  private String chasis;
  private String modelo;
  private String fechamatricula;
  private String pasajeros;
  private String cantsentados;
  private String cantpies;
  private String pesoseco;
  private String pesobruto;
  private String cantpuertas;
  private String marca;
  private String linea;
  private UUID idempresa;


}
