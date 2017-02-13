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
public class Deportista extends Contacto{
private String genero;
private String deporte;
public Deportista(String nombre, String apellidoP, String apellidoM,String mediosCon, String fechadeN, String genero, String deporte)
{
super(nombre, apellidoP, apellidoM, mediosCon, fechadeN);	
this.genero=genero;
this.deporte=deporte;
}
public Deportista(Object datosContacto, String genero, String deporte) {
	super(((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
			((Contacto) datosContacto).getApellidoM(), ((Contacto) datosContacto).getMedioC());
	this.genero=genero;
	this.deporte=deporte;
}
public void setGenero(String genero)
{this.genero=genero;}

public String getGenero()
{return genero;}

public void setDeporte(String deporte)
{this.deporte=deporte;}

public String getDeporte()
{return deporte;}
public String toString() {
	String datosDeportista = "NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
			getApellidoM()+" MEDIOS DE CONTACTO "+getMedioC().toString()+" Genero: "+this.genero+
			" Deporte: "+this.deporte;
	return datosDeportista;
}
}

