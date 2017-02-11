package Proyecto;

public class Deportista extends Contacto{
private String genero;
private String deporte;
public Deportista(String nombre, String apellidoP, String apellidoM,String mediosCon, String fechadeN, String genero, String deporte)
{
super(nombre, apellidoP, apellidoM, mediosCon, fechadeN);	
this.genero=genero;
this.deporte=deporte;
}
public void Set_Genero(String genero)
{this.genero=genero;}

public String Get_Genero()
{return genero;}

public void Set_Deporte(String deporte)
{this.deporte=deporte;}

public String Get_Deporte()
{return deporte;}

}
