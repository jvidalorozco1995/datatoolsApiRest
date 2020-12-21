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

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

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
	public int getCantsentados() {
		return cantsentados;
	}
	public void setCantsentados(int cantsentados) {
		this.cantsentados = cantsentados;
	}
	public int getCantpies() {
		return cantpies;
	}
	public void setCantpies(int cantpies) {
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
	public int getCantpuertas() {
		return cantpuertas;
	}
	public void setCantpuertas(int cantpuertas) {
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
	public String getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(String idempresa) {
		this.idempresa = idempresa;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
private String motor;
  private String chasis;
  private String modelo;
  private String fechamatricula;
  private String pasajeros;
  private int cantsentados;
  private int cantpies;
  private String pesoseco;
  private String pesobruto;
  private int cantpuertas;
  private String marca;
  private String linea;
  private String idempresa;
  private String placa;

}
