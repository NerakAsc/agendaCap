package Proyecto;

public class Licenciado extends Contacto {
private int telOf;
private String horaA;

public Licenciado(String nombre, String apellidoP, String apellidoM, String mediosCon, int telOf, String horaA){
	super(nombre,apellidoP, apellidoM, mediosCon);
	this.telOf=telOf;
	this.horaA=horaA;
}
public void Set_TelOf(int telOf)
{this.telOf=telOf;}

public int Get_TelOf()
{return telOf;}

public void Set_HoraA(String horaA)
{this.horaA=horaA;}

public String Get_HoraA()
{return horaA;}

}
