package Contactos;

public class Estudiante extends Contacto{
	private String lugarN;
	private String carreraE;

	public Estudiante(){
		lugarN="Indefinido.";
		carreraE="Sin definir";
	}
	public Estudiante(int id, String nombre, String apellidoP, String apellidoM, String mediosCon,String fechadeN, String lugarN,String carreraE){
		super(id,nombre,apellidoP, apellidoM, mediosCon,fechadeN);
		this.lugarN=lugarN;
		this.carreraE=carreraE;
	}
	public Estudiante(Object datosContacto, String lugarN, String carreraE) {
		super(((Contacto) datosContacto).getId(),((Contacto) datosContacto).getNombre(),((Contacto) datosContacto).getApellidoP(),
				((Contacto) datosContacto).getApellidoM(), ((Contacto) datosContacto).getMedioC());
		this.lugarN=lugarN;
		this.carreraE=carreraE;
	}
	public void setLugarN(String lugarN)
	{this.lugarN=lugarN;}
	
	public String getLugarN()
	{return lugarN;}
	
	public void setCarreraE(String carreraE)
	{this.carreraE=carreraE;}
	
	public String getCarreraE()
	{return carreraE;}
	
	
	public String toString() {
		String datosEstudiante = "Id: "+getId()+" NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
				getApellidoM()+" MEDIOS DE CONTACTO "+getMedioC().toString()+" LUGAR DE NACIMIENTO: "+this.lugarN+
				" CARRERA QUE ESTUDIA: "+this.carreraE;
		return datosEstudiante;
	}
}
