package Proyecto;

public class Contacto {
private String nombre;
private String apellidoP;
private String apellidoM;
private String mediosCon;
private String fechadeN;

public Contacto()
{
nombre="Sin Nombre";
apellidoP="Sin Apellido Paterno";
apellidoM="Sin Apellido Materno";
mediosCon="Sin Medio de Comunicación";
fechadeN="Sin Fecha de Nacimiento";
}

public Contacto(String nombre, String apellidoP, String apellidoM, String mediosCon)
{
this.nombre=nombre;
this.apellidoP=apellidoP;
this.apellidoM=apellidoM;
this.mediosCon=mediosCon;
}

public Contacto(String nombre, String apellidoP, String apellidoM, String mediosCon, String fechadeN)
{
this.nombre=nombre;
this.apellidoP=apellidoP;
this.apellidoM=apellidoM;
this.mediosCon=mediosCon;
this.fechadeN=fechadeN;
}

public void Set_Nombre(String nombre)
{this.nombre=nombre;}

public String Get_Nombre()
{return nombre;}

public void Set_ApellidoP(String apellidoP)
{this.apellidoP=apellidoP;}

public String Get_ApellidoP()
{return apellidoP;}

public void Set_ApellidoM(String apellidoM)
{this.apellidoM=apellidoM;}

public String Get_ApellidoM()
{return apellidoM;}

public void Set_MediosCon(String mediosCon)
{this.mediosCon=mediosCon;}

public String Get_MediosCon()
{return mediosCon;}

public void Set_FechadeN(String fechadeN)
{this.fechadeN=fechadeN;}

public String Get_FechadeN()
{return fechadeN;}

}
