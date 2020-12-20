package com.org.data.models;

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
    private Long id;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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
	public String getTipoDocumentoRepLegal() {
		return tipoDocumentoRepLegal;
	}
	public void setTipoDocumentoRepLegal(String tipoDocumentoRepLegal) {
		this.tipoDocumentoRepLegal = tipoDocumentoRepLegal;
	}
	public String getNumeroDocumentoRepLegal() {
		return numeroDocumentoRepLegal;
	}
	public void setNumeroDocumentoRepLegal(String numeroDocumentoRepLegal) {
		this.numeroDocumentoRepLegal = numeroDocumentoRepLegal;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefonoRepLegal() {
		return telefonoRepLegal;
	}
	public void setTelefonoRepLegal(String telefonoRepLegal) {
		this.telefonoRepLegal = telefonoRepLegal;
	}
	private String tipoDocumento; 
	private String numeroDocumento;
	private String nombre; 
	private String direccion; 
	private String ciudad;
	private String departamento;
	private String pais; 
	private String telefono; 
	private String tipoDocumentoRepLegal; 
	private String numeroDocumentoRepLegal; 
	private String nombres;
	private String telefonoRepLegal;
}
