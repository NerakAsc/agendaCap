package Contactos;
public class Deportista extends Contacto{
private String genero;
private String deporte;
private String fechaN;


public Deportista(int id, String nombre, String apellidoP, String apellidoM,Object mediosCon, String fechadeN, String genero, String deporte)
{
super(id,nombre, apellidoP, apellidoM);	
this.genero=genero;
this.deporte=deporte;
this.fechaN=fechadeN;

}
public Deportista(Object datosContacto,String fechaN,Object medioC, String genero, String deporte) {
	super(((Contacto) datosContacto).getId(),((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
			((Contacto) datosContacto).getApellidoM(),medioC);
	this.genero=genero;
	this.deporte=deporte;
        this.fechaN=fechaN;
    
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
			getApellidoM()+" MEDIOS DE CONTACTO "+super.superToString()+" Genero: "+this.genero+
			" Deporte: "+this.deporte;
	return datosDeportista;
}
}
