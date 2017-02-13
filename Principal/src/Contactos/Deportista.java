package Contactos;


public class Deportista extends Contacto{
private String genero;
private String deporte;
public Deportista(int id, String nombre, String apellidoP, String apellidoM,String mediosCon, String fechadeN, String genero, String deporte)
{
super(id,nombre, apellidoP, apellidoM, mediosCon, fechadeN);	
this.genero=genero;
this.deporte=deporte;
}
public Deportista(Object datosContacto, String genero, String deporte) {
	super(((Contacto) datosContacto).getId(),((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
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

public void setReemplazarD(Deportista dep) {
	super.setReemplazarC(dep.getNombre(), dep.getApellidoP(), dep.getApellidoM(), dep.getMedioC());
	this.genero=dep.getGenero();
	this.deporte=dep.getDeporte();
}

public String toString() {
	String datosDeportista = "Id: "+getId()+" NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
			getApellidoM()+" MEDIOS DE CONTACTO "+getMedioC().toString()+" Genero: "+this.genero+
			" Deporte: "+this.deporte;
	return datosDeportista;
}
}
