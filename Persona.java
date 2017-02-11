package Proyecto;

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
public void Set_Domicilio(String domicilio)
{this.domicilio=domicilio;}

public String Get_Domicilio()
{return domicilio;}

public void Set_MedioPref(String medioPref)
{this.medioPref=medioPref;}

public String Get_MedioPref()
{return medioPref;}

public void Set_Ocupacion(String ocupacion)
{this.ocupacion=ocupacion;}

public String Get_Ocupacion()
{return ocupacion;}

}
