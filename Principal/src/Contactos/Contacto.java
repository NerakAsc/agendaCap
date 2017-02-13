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
public class Contacto extends MediosContacto {
	private int id;
private String nombre;
private String apellidoP;
private String apellidoM;
private Object medioC;
private String fechaN;

public Contacto()
{

nombre="Sin Nombre";
apellidoP="Sin Apellido Paterno";
apellidoM="Sin Apellido Materno";
//medioC="Sin Medio de Contacto";
fechaN="Sin Fecha de Nacimiento";
}

public Contacto(int id,String nombre, String apellidoP, String apellidoM, Object medioC)
{
	super(((MediosContacto) medioC).getCelular(),((MediosContacto) medioC).getCasa(),((MediosContacto) medioC).getEmail());
this.nombre=nombre;
this.apellidoP=apellidoP;
this.apellidoM=apellidoM;
this.medioC=medioC;
}

public Contacto(int id,String nombre, String apellidoP, String apellidoM, Object medioC, String fechaN)
{
	super(((MediosContacto) medioC).getCelular(),((MediosContacto) medioC).getCasa(),((MediosContacto) medioC).getEmail());
this.nombre=nombre;
this.apellidoP=apellidoP;
this.apellidoM=apellidoM;
this.medioC=medioC;
this.fechaN=fechaN;
}

public int getId() {
	return id;
}
	
public void setNombre(String nombre)
{this.nombre=nombre;}

public String getNombre()
{return nombre;}

public void setApellidoP(String apellidoP)
{this.apellidoP=apellidoP;}

public String getApellidoP()
{return apellidoP;}

public void setApellidoM(String apellidoM)
{this.apellidoM=apellidoM;}

public String getApellidoM()
{return apellidoM;}

public void setMediosC(MediosContacto medioC)
{this.medioC=medioC;}

public Object getMedioC()
{return medioC;}

public void setFechaN(String fechaN)
{this.fechaN=fechaN;}

public String getFechaN()
{return fechaN;}
public void setReemplazarC(String nombre, String apellidoP,String apellidoM,Object medioC) {
	this.nombre=nombre;
	this.apellidoP=apellidoP;
	this.apellidoM=apellidoM;
	this.medioC=medioC;
}

public String toString() {
	String datosC = "Id: "+id+" NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
			getApellidoM();
	return datosC;
}
}
