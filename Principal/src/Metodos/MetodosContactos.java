package Metodos;


import Contactos.Persona;//importamos la clase persona para agregar en lista
import Contactos.Contacto;
import Contactos.Deportista;
import Contactos.Doctor;
import Contactos.Estudiante;
import Contactos.Licenciado;
import Contactos.MediosContacto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class MetodosContactos {
    
        static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	private static Set<Persona> listPersona = new HashSet<Persona>();//inicializacion: implementa la lista set
	private static Iterator<Persona> it = listPersona.iterator();
	private static Set<Deportista> listDeportista = new HashSet<Deportista>();//inicializacion: implementa la lista set
	private static Set<Doctor> listDoctor = new HashSet<Doctor>();//inicializacion: implementa la lista set
	private static Set<Estudiante> listEstudiante = new HashSet<Estudiante>();//inicializacion: implementa la lista set
	private static Set<Licenciado> listLicenciado = new HashSet<Licenciado>();//inicializacion: implementa la lista set
	
	public static void agregarPersona() throws IOException {//este metodo agrega a una lista todos los contactos(datos) de persona

		listPersona.add((Persona) datosPersona());//variable: agregamos los datos a la lista
	}
	
	public static Object datosPersona() throws IOException {//este metodo extrae los datos de persona y regresa un objeto con los datos
		Object obj=datosContacto();//metodo: extrea en un objeto los datos principales del metodo datosContacto()
		String domicilio=" ", ocupacion=" ";
                while(domicilio==" "){
                    System.out.print("Domicilio: ");
                    domicilio = in.readLine();//String: para el domicilio
                }
		System.out.print("Medio preferido de comunicacion: (Celular/Casa/Email) ");
		String medioPref = in.readLine();//String: para el medio preferido de comunicacion
		while(ocupacion==" "){
                    System.out.print("Ocupacion: ");
                    ocupacion = in.readLine();//string: para la ocupacion
                }
		Persona per = new Persona(obj,domicilio,medioPref,ocupacion);//inicializacion: implementacion del constructor persona para sus datos
		return per;//regresa el objeto para agregarlo en la lista
	}//modificado
	
	public static void mostrarPersona() {//este metodo muestra la lista de personas
		System.out.println("_-=LISTA DE PERSONAS=-_");
		for(Persona p: listPersona) {
			System.out.println(p.toString());
		}
	}
	
	public static void borrarPersona() {//este metodo recorre la lista persona y borra segun el nombre
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String borrar = in.next();
		for(Persona p: listPersona){
			if(p.getNombre().equals(borrar))
				listPersona.remove(p);
		}
		/*Persona nombre;
		while(it.hasNext()){
			nombre = it.next();
			if(nombre.getNombre().equals(borrar))
				it.remove();
		}*/
	}
	
	public static void remplazarPersona() {//este metodo remplaza el contacto persona mediante el id
		Scanner in = new Scanner(System.in);
		System.out.print("Dame Id: ");
		int remplazar = in.nextInt();
		for(Persona p: listPersona) {
			if(p.getId()==remplazar) {
				Persona persona = (Persona)datosPersona();
				p.setReemplazarP(persona);	
			}		
		}
	}
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto deportista 
	public static void agregarDeportista() throws IOException {

		listDeportista.add((Deportista) datosDeportista());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto deportista
        public static String generoD() throws IOException{
         String genero=" ";
         while(genero==" "){
                    System.out.print("Genero M/F: ");
                    genero = in.readLine();
                }
         return genero;
        }
	public static Object datosDeportista() throws IOException {
		Object obj=datosContactoFechaN();
                String genero=" ",deporte=" ";
		/*while(genero==" "){
                    System.out.print("Genero M/F: ");
                    genero = in.readLine();
                }*/
                genero= generoD();
                
                if(genero!= "")
		if(genero.equalsIgnoreCase("m")){
			genero="Masculino";
		}else if(genero.equalsIgnoreCase("f"))
		{genero="Femenino";}
		else{
			System.out.println("El genero no es correcto");
                        
			}
                
               
		while(deporte==" "){
                    System.out.print("Deporte Futbol:1 , Basquetbol:2 , Beisbol:3, Otro:4 ");
                    deporte = in.readLine();
                }
		if(deporte.equalsIgnoreCase("1")||deporte.equalsIgnoreCase("UNO")){
			deporte="Futbol";
		}else if(deporte.equalsIgnoreCase("2")||deporte.equalsIgnoreCase("DOS"))
		{genero="Basquetbol";}
		else if(deporte.equalsIgnoreCase("3")||deporte.equalsIgnoreCase("TRES"))
		{genero="Beisbol";}
		else if(deporte.equalsIgnoreCase("4")||deporte.equalsIgnoreCase("CUATRO"))
		{
			System.out.println("Cual es el deporte:");
			String deporten = in.readLine();
			genero= deporten;}
		else{
		System.out.println("Ingresa un numero dentro del rango proporcionado");
		datosDeportista();
		}
		
		Deportista dep = new Deportista(obj,genero,deporte);
		return dep;
	}//modificando...
	
	public static void mostrarDeportista() {//este metodo muestra la lista de deportistas
		System.out.println("_-=LISTA DE DEPORTISTAS=-_");
		for(Deportista d: listDeportista) {
			System.out.println(d.toString());
		}
	}
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto doctor
	public static void agregarDoctor() throws IOException {

		listDoctor.add((Doctor) datosDoctor());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto doctor
	private static Object datosDoctor() throws IOException {
		Object obj=datosContacto();
        	System.out.print("Especialidad: ");
		String especialidad = in.readLine();
		System.out.print("Nombre del Hospital: ");
		String nombreHos = in.readLine();
		System.out.print("Direccion del Hospital: ");
		String direccH = in.readLine();
		Doctor doc = new Doctor(obj,especialidad,nombreHos,direccH);
		return doc;
	}
	public static void mostrarDoctor() {//este metodo muestra la lista de doctores
		System.out.println("_-=LISTA DE DOCTORES=-_");
		for(Doctor d: listDoctor) {
			System.out.println(d.toString());
		}
	}
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto estudiante 
	public static void agregarEstudiante() throws IOException {

		listEstudiante.add((Estudiante) datosEstudiante());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto estudiante
	private static Object datosEstudiante() throws IOException {
		Object obj=datosContactoFechaN();
		System.out.print("Lugar de nacimiento: ");
		String lugarN = in.readLine();
		System.out.print("Carrera que estudia: ");
		String carreraE = in.readLine();
		Estudiante est = new Estudiante(obj,lugarN,carreraE);
		return est;
	}
	
	public static void mostrarEstudiante() {//este metodo muestra la lista estudiantes
		System.out.println("_-=LISTA DE ESTUDIANTES=-_");
		for(Estudiante e: listEstudiante) {
			System.out.println(e.toString());
		}
	}
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto licenciado 
	public static void agregarLicenciado() throws IOException {
	
		listLicenciado.add((Licenciado) datosLicenciado());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto licenciado
	private static Object datosLicenciado() throws IOException {
		Object obj=datosContacto();
		System.out.print("Telefono de oficina: ");
		String telOf = in.readLine();
		System.out.print("Horario de atencion: ");
		String horaA = in.readLine();
		Licenciado lic = new Licenciado(obj,telOf,horaA);
		return lic;
	}
	
	public static void mostrarLicenciado() {//este metodo muestra la lista licenciado
		System.out.println("_-=LISTA DE LICENCIADOS=-_");
		for(Licenciado e: listLicenciado) {
			System.out.println(e.toString());
		}
	}
	
	public static Object datosContacto() throws IOException {//este metodo extrae los datos para la clase Contacto de la que extienden los demas contactos
                
		System.out.print("Nombre: ");
		String nombre = in.readLine();
		System.out.print("Apellido paterno: ");
		String apellidoP = in.readLine();
		System.out.print("Apellido materno: ");
		String apellidoM = in.readLine();
		System.out.println("Medios de contacto");
		Object medioC = medioContacto();//metodo: la opcion del medio de contacto
		Contacto cont = new Contacto(nombre, apellidoP, apellidoM,medioC);
                return cont;
	}
	
	public static Object datosContactoFechaN() throws IOException {//este metodo extrae los datos con fecha de nacimiento para la clase Contacto de la que extienden los demas contactos
		System.out.print("Nombre: ");
		String nombre = in.readLine();
		System.out.print("Apellido paterno: ");
		String apellidoP = in.readLine();
		System.out.print("Apellido materno: ");
		String apellidoM = in.readLine();
		System.out.println("Medios de contacto");
		Object medioC = medioContacto();//metodo: la opcion del medio de contacto
		System.out.print("Fecha de nacimiento:  ");
		String fechaN = in.readLine();
		Contacto cont = new Contacto(nombre, apellidoP, apellidoM,medioC,fechaN);
		return cont;
	}
	
	public static Object medioContacto() {
		//Set<MediosContacto> listMediosC = new HashSet<MediosContacto>();//inicializacion: implementa la lista set
		MediosContacto mediosC = new MediosContacto();
		Scanner in = new Scanner(System.in);
		System.out.print("Agrega celular: ");
		String celular = in.nextLine();
		System.out.print("Agrega telefono de casa: ");
		String telefonoC = in.nextLine();
		System.out.print("Agrega email: ");
		String email = in.nextLine();
		//System.out.print("Quieres agregar nuevamente medio de contacto? N/S");
		//char otravez = in.next().charAt(0);
		mediosC = new MediosContacto(celular,telefonoC,email);
		//listMediosC.add(mediosC);
		//if(otravez=='S'||otravez=='s')
		//	medioContacto();
		return mediosC;	
                
                
	}
        
        	public static void borrarDeportista() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String borrar = in.next();
		for(Deportista d: listDeportista){
			if(d.getNombre().equals(borrar))
				listDeportista.remove(d);
		}
	}
	

	public static void borrarDoctor() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String borrar = in.next();
		for(Doctor d: listDoctor){
			if(d.getNombre().equals(borrar))
				listDoctor.remove(d);
		}
	}
	
	public static void borrarEstudiante() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String borrar = in.next();
		for(Estudiante e: listEstudiante){
			if(e.getNombre().equals(borrar))
				listEstudiante.remove(e);
		}
	}
	
	public static void borrarLicenciado() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String borrar = in.next();
		for(Licenciado l: listLicenciado){
			if(l.getNombre().equals(borrar))
				listLicenciado.remove(l);
		}
	}
	
}

