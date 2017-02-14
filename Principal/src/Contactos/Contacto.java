public class Contacto extends MediosContacto {
	private int id;
private String nombre;
private String apellidoP;
private String apellidoM;

public Contacto()
{
nombre="Sin Nombre";
apellidoP="Sin Apellido Paterno";
apellidoM="Sin Apellido Materno";
}


public Contacto(int id, String nombre, String apellidoP, String apellidoM)

{
	this.id=id;
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
}

public Contacto(int id, String nombre, String apellidoP, String apellidoM, Object medioC)
{
	super(((MediosContacto) medioC).getMedio(),((MediosContacto) medioC).getValor());
	this.id=id;
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
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

public void setReemplazarC(String nombre, String apellidoP,String apellidoM) {
	this.nombre=nombre;
	this.apellidoP=apellidoP;
	this.apellidoM=apellidoM;
	//this.medioC=medioC;
}

public String superToString() {
	return super.toString();
}

public String toString() {
	String datosC = "Id: "+id+" NOMBRE: "+getNombre()+" APELLIDO PATERNO: "+getApellidoP()+" APELLIDO MATERNO: "+
			getApellidoM();
	return datosC;
}
}
