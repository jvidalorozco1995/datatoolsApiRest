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
	public String gettipodocumento() {
		return tipodocumento;
	}
	public void settipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getnumeroDocumento() {
		return numerodocumento;
	}
	public void setnumeroDocumento(String numeroDocumento) {
		this.numerodocumento = numeroDocumento;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
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
	public String gettipoDocumentorepLegal() {
		return tipodocumentoreplegal;
	}
	public void settipodocumentorepLegal(String tipoDocumentoreplegal) {
		this.tipodocumentoreplegal = tipoDocumentoreplegal;
	}
	public String getnumerodocumentoRepLegal() {
		return numerodocumentoreplegal;
	}
	public void setnumerodocumentorepLegal(String numerodocumentoreplegal) {
		this.numerodocumentoreplegal = numerodocumentoreplegal;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefonoRepLegal() {
		return telefonoreplegal;
	}
	public void settelefonoreplegal(String telefonoRepLegal) {
		this.telefonoreplegal = telefonoRepLegal;
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
