package Proyecto;

public class Estudiante extends Contacto{
	private String lugarN;
	private String carreraE;
	private String eMail;

	public Estudiante(){
		lugarN="Indefinido.";
		carreraE="Sin definir";
		eMail="ejemplo@ejemplo.com";
	}
	public Estudiante(String nombre, String apellidoP, String apellidoM, String mediosCon,String fechadeN, String lugarN,String carreraE, String eMail){
		super(nombre,apellidoP, apellidoM, mediosCon,fechadeN);
		this.lugarN=lugarN;
		this.carreraE=carreraE;
		this.eMail=eMail;
	}
	public void Set_LugarN(String lugarN)
	{this.lugarN=lugarN;}
	
	public String Get_LugarN()
	{return lugarN;}
	
	public void Set_CarreraE(String carreraE)
	{this.carreraE=carreraE;}
	
	public String Get_CarreraE()
	{return carreraE;}
	
	public void Set_Email(String eMail)
	{this.eMail=eMail;}
	
	public String Get_Email()
	{return eMail;}
}
