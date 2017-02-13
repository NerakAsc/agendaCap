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
public class Doctor extends Contacto {
	private String especialidad;
	private String nombreHos;
	private String direccH;
	public Doctor(String nombre, String apellidoP, String apellidoM, String mediosCon, String fechadeN, String especialidad, String nombreHos, String direccH)
	{
		super(nombre, apellidoP, apellidoM, mediosCon, fechadeN);
		this.especialidad=especialidad;
		this.nombreHos=nombreHos;
		this.direccH=direccH;
	}
	
	public Doctor(Object datosContacto, String especialidad, String nombreHos, String direccH) {
		super(((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
				((Contacto) datosContacto).getApellidoM(), ((Contacto) datosContacto).getMedioC());	
		this.especialidad=especialidad;
		this.nombreHos=nombreHos;
		this.direccH=direccH;
	}

	public void setEspecialidad(String especialidad)
	{this.especialidad=especialidad;}
	
	public String setEspecialidad()
	{return especialidad;}
	
	public void setNombreHos(String nombreHos)
	{this.nombreHos=nombreHos;}
	
	public String getNombreHos()
	{return nombreHos;}

	public void setDireccH(String direccH)
	{this.direccH=direccH;}
	
	public String getDireccH()
	{return direccH;}
	
	public String toString() {
		String datosDoctor = "NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
				getApellidoM()+" MEDIOS DE CONTACTO "+getMedioC().toString()+" ESPECIALIDAD: "+this.especialidad+
				" NOMBRE DEL HOSPITAL: "+this.nombreHos+" DIRECCION DEL HOSPITAL: "+this.direccH;
		return datosDoctor;
	}
}

