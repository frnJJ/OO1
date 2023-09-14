package ar.edu.unlp.info.oo1.Ejercicio5;

import java.util.Date;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private Date nacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abueloPaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abuelaPaterna;
	
	
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero() {
		
	}
	
	public boolean tieneComoAncestroA (Mamifero anonimo) {
		boolean ok = false;
		
		if (this.madre  != null) {
			ok = madre.tieneComoAncestroA(anonimo);
			
		}
		if (this.padre != null && !ok ) {
			padre.tieneComoAncestroA(anonimo);
		}
		
		return ok;
		
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		return abueloMaterno;
	}
	public Mamifero getAbueloPaterno() {
		return abueloPaterno;
	}
	public Mamifero getAbuelaMaterna() {
		return abuelaMaterna;
	}
	public Mamifero getAbuelaPaterna() {
		return abuelaPaterna;
	}
	
	
	
	
	
	
	

}
