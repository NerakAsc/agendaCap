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
public class Licenciado extends Contacto {
private String telOf;
private String horaA;

public Licenciado(String nombre, String apellidoP, String apellidoM, String mediosCon, String telOf, String horaA){
	super(nombre,apellidoP, apellidoM, mediosCon);
	this.telOf=telOf;
	this.horaA=horaA;
}
public Licenciado(Object datosContacto, String telOf, String horaA) {
	super(((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
			((Contacto) datosContacto).getApellidoM(), ((Contacto) datosContacto).getMedioC());
	this.telOf=telOf;
	this.horaA=horaA;
}
public void setTelOf(String telOf)
{this.telOf=telOf;}

public String getTelOf()
{return telOf;}

public void setHoraA(String horaA)
{this.horaA=horaA;}

public String getHoraA()
{return horaA;}
public String toString() {
	String datosLicenciado = "NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
			getApellidoM()+" MEDIOS DE CONTACTO "+getMedioC().toString()+" TELEFONO DE OFICINA: "+this.telOf+
			" HORARIOS DE ATENCION: "+this.horaA;
	return datosLicenciado;
}
}
