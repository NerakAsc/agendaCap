package Metodos;
import java.util.*;

import Contactos.Persona;//importamos la clase persona para agregar en lista
import Contactos.Contacto;
import Contactos.Deportista;
import Contactos.Doctor;
import Contactos.Estudiante;
import Contactos.Licenciado;
import Contactos.MediosContacto;


public class MetodosContactos {
	
	private static Set<Persona> listPersona = new HashSet<Persona>();//inicializacion: implementa la lista set
	private static Iterator<Persona> it = listPersona.iterator();
	private static Set<Deportista> listDeportista = new HashSet<Deportista>();//inicializacion: implementa la lista set
	private static Set<Doctor> listDoctor = new HashSet<Doctor>();//inicializacion: implementa la lista set
	private static Set<Estudiante> listEstudiante = new HashSet<Estudiante>();//inicializacion: implementa la lista set
	private static Set<Licenciado> listLicenciado = new HashSet<Licenciado>();//inicializacion: implementa la lista set
	
	public static void agregarPersona() {//este metodo agrega a una lista todos los contactos(datos) de persona

		listPersona.add((Persona) datosPersona());//variable: agregamos los datos a la lista
		
	}
	
	public static Object datosPersona() {//este metodo extrae los datos de persona y regresa un objeto con los datos
		Object obj=datosContacto();//metodo: extrea en un objeto los datos principales del metodo datosContacto()
		Scanner in = new Scanner(System.in);//inicialixacion: implementacion de Scanner para pedir datos
		System.out.print("Domicilio: ");
		String domicilio = in.next();//String: para el domicilio
		System.out.print("Medio preferido de comunicacion: ");
		String medioPref = in.next();//String: para el medio preferido de comunicacion
		System.out.print("Ocupacion: ");
		String ocupacion = in.next();//string: para la ocupacion
		Persona per = new Persona(obj,domicilio,medioPref,ocupacion);//inicializacion: implementacion del constructor persona para sus datos
		return per;//regresa el objeto para agregarlo en la lista
	}
	
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
	
	public static void remplazarPersona() {//este metodo remplaza el contacto persona
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String remplazar = in.next();
		for(Persona p: listPersona) {
		//	if(p.getNombre().equals(remplazar))
				//listPersona.set(p);
		}
		
	}
	
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto deportista 
	public static void agregarDeportista() {

		listDeportista.add((Deportista) datosDeportista());
	}
	
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto deportista
	public static Object datosDeportista() {
		Object obj=datosContacto();
		Scanner in = new Scanner(System.in);
		System.out.print("Genero: ");
		String genero = in.next();
		System.out.print("Deporte: ");
		String deporte = in.next();
		Deportista dep = new Deportista(obj,genero,deporte);
		return dep;
	}
	
	public static void mostrarDeportista() {//este metodo muestra la lista de deportistas
		System.out.println("_-=LISTA DE DEPORTISTAS=-_");
		for(Deportista d: listDeportista) {
			System.out.println(d.toString());
		}
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
	
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto doctor
	public static void agregarDoctor() {

		listDoctor.add((Doctor) datosDoctor());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto doctor
	private static Object datosDoctor() {
		Object obj=datosContacto();
		Scanner in = new Scanner(System.in);
		System.out.print("Especialidad: ");
		String especialidad = in.next();
		System.out.print("Nombre del Hospital: ");
		String nombreHos = in.next();
		System.out.print("Direccion del Hospital: ");
		String direccH = in.next();
		Doctor doc = new Doctor(obj,especialidad,nombreHos,direccH);
		return doc;
	}
	public static void mostrarDoctor() {//este metodo muestra la lista de doctores
		System.out.println("_-=LISTA DE DOCTORES=-_");
		for(Doctor d: listDoctor) {
			System.out.println(d.toString());
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
	
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto estudiante 
	public static void agregarEstudiante() {

		listEstudiante.add((Estudiante) datosEstudiante());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto estudiante
	private static Object datosEstudiante() {
		Object obj=datosContactoFechaN();
		Scanner in = new Scanner(System.in);
		System.out.print("Lugar de nacimiento: ");
		String lugarN = in.next();
		System.out.print("Carrera que estudia: ");
		String carreraE = in.next();
		Estudiante est = new Estudiante(obj,lugarN,carreraE);
		return est;
	}
	
	public static void mostrarEstudiante() {//este metodo muestra la lista estudiantes
		System.out.println("_-=LISTA DE ESTUDIANTES=-_");
		for(Estudiante e: listEstudiante) {
			System.out.println(e.toString());
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
	
	
	//El metodo a continuacion, se puede hacer referencia al metodo agregarPersona() solo con los datos de contacto licenciado 
	public static void agregarLicenciado() {
	
		listLicenciado.add((Licenciado) datosLicenciado());
	}
	//El metodo a continuacion, se puede hacer referencia al metodo datosPersona() solo con los datos de contacto licenciado
	private static Object datosLicenciado() {
		Object obj=datosContacto();
		Scanner in = new Scanner(System.in);
		System.out.print("Telefono de oficina: ");
		String telOf = in.next();
		System.out.print("Horario de atencion: ");
		String horaA = in.next();
		Licenciado lic = new Licenciado(obj,telOf,horaA);
		return lic;
	}
	
	public static void mostrarLicenciado() {//este metodo muestra la lista licenciado
		System.out.println("_-=LISTA DE LICENCIADOS=-_");
		for(Licenciado e: listLicenciado) {
			System.out.println(e.toString());
		}
	}
	
	public static void borrarLicenciado() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String borrar = in.next();
		for(Licenciado e: listLicenciado){
			if(e.getNombre().equals(borrar))
				listLicenciado.remove(e);
		}
	}
	public static Object datosContacto() {//este metodo extrae los datos para la clase Contacto de la que extienden los demas contactos
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = in.next();
		System.out.print("Apellido paterno: ");
		String apellidoP = in.next();
		System.out.print("Apellido materno: ");
		String apellidoM = in.next();
		System.out.println("Medios de contacto");
		Object medioC = medioContacto();//metodo: la opcion del medio de contacto
		Contacto cont = new Contacto(nombre, apellidoP, apellidoM,medioC);
		return cont;
	}
	
	public static Object datosContactoFechaN() {//este metodo extrae los datos con fecha de nacimiento para la clase Contacto de la que extienden los demas contactos
		Scanner in = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = in.next();
		System.out.print("Apellido paterno: ");
		String apellidoP = in.next();
		System.out.print("Apellido materno: ");
		String apellidoM = in.next();
		System.out.println("Medios de contacto");
		Object medioC = medioContacto();//metodo: la opcion del medio de contacto
		System.out.print("Fecha de nacimiento:  ");
		String fechaN = in.next();
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
}
