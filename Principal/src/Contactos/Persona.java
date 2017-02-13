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
public class Persona extends Contacto {
String domicilio;
String medioPref;
String ocupacion;
public Persona(String nombre, String apellidoP, String apellidoM, String mediosCon, String domicilio, String medioPref, String ocupacion){
	super(nombre,apellidoP, apellidoM, mediosCon);	
	this.domicilio=domicilio;
	this.medioPref=medioPref;
	this.ocupacion=ocupacion;
}
public Persona(Object datosContacto, String domicilio, String medioPref, String ocupacion) {
	super(((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
			((Contacto) datosContacto).getApellidoM(), ((Contacto) datosContacto).getMedioC());	
	this.domicilio=domicilio;
	this.medioPref=medioPref;
	this.ocupacion=ocupacion;
}
public void setDomicilio(String domicilio)
{this.domicilio=domicilio;}

public String getDomicilio()
{return domicilio;}

public void setMedioPref(String medioPref)
{this.medioPref=medioPref;}

public String getMedioPref()
{return medioPref;}

public void setOcupacion(String ocupacion)
{this.ocupacion=ocupacion;}

public String getOcupacion()
{return ocupacion;}

public String toString() {
	String datosPersona = "NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
			getApellidoM()+" MEDIOS DE CONTACTO "+getMedioC().toString()+" DOMICILIO: "+this.domicilio+
			" MEDIO DE CONTACTO PREFERIDO: "+this.medioPref+" OCUPACION: "+this.ocupacion;
	return datosPersona;
}
}
