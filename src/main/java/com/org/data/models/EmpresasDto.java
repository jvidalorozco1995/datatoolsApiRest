package com.org.data.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "empresas")
public class EmpresasDto {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;
	

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipodocumentoreplegal() {
		return tipodocumentoreplegal;
	}
	public void setTipodocumentoreplegal(String tipodocumentoreplegal) {
		this.tipodocumentoreplegal = tipodocumentoreplegal;
	}
	public String getNumerodocumentoreplegal() {
		return numerodocumentoreplegal;
	}
	public void setNumerodocumentoreplegal(String numerodocumentoreplegal) {
		this.numerodocumentoreplegal = numerodocumentoreplegal;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefonoreplegal() {
		return telefonoreplegal;
	}
	public void setTelefonoreplegal(String telefonoreplegal) {
		this.telefonoreplegal = telefonoreplegal;
	}
	private String tipodocumento; 
	private String numerodocumento;
	private String nombre; 
	private String direccion; 
	private String ciudad;
	private String departamento;
	private String pais; 
	private String telefono; 
	private String tipodocumentoreplegal; 
	private String numerodocumentoreplegal; 
	private String nombres;
	private String telefonoreplegal;
}
