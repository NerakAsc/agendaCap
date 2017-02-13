/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contactos;

/**
 *
 * @author akare
 */
public class MediosContacto implements java.io.Serializable {
private String celular;
private String casa;
private String email;
public MediosContacto() {
	celular = "sin celular";
	casa = "sin telefono de casa";
	email = "sin email";
}

public MediosContacto(String celular, String casa, String email) {
	this.celular = celular;
	this.casa = casa;
	this.email = email;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getCasa() {
	return casa;
}

public void setCasa(String casa) {
	this.casa = casa;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}	

public String toString() {
	String datosMediosC = "CELULAR: "+this.celular+" CASA: "+this.casa+" EMAIL: "+this.email;
	return datosMediosC;
}
}
