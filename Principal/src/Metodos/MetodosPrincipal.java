/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author akare
 */
public class MetodosPrincipal extends MetodosContactos{//extendemos de la clase MetodosContactos para utilisar sus metodos
	
	public static void agregar(int opcionContacto) {//metodo utilizado en la clase principal UsoContacto, que segun la respuesta agrega el tipo de contacto
		if(opcionContacto==1)
			agregarPersona();//metodo: extrae los datos de persona para insertarlos en una lista, es un atributo de la clase MetodosContactos
		if(opcionContacto==2)
			agregarDeportista();//metodo: extrae los datos de deportista para insertarlos en una lista, es un atributo de la clase MEtodosContactos
		if(opcionContacto==3)
			agregarDoctor();//metodo: extrae los datos de doctor para insertarlos en una lista, es un atributo de la clase MEtodosContactos
		if(opcionContacto==4)
			agregarEstudiante();//metodo: extrae los datos de estudiante para insertarlos en una lista, es un atributo de la clase MEtodosContactos
		if(opcionContacto==5)
			agregarLicenciado();//metodo: extrae los datos de licenciado para insertarlos en una lista, es un atributo de la clase MEtodosContactos
	}

	public static void mostrar() {//metodo que extrae cada lista de contactos
		System.out.println("\n");
		mostrarPersona();
		System.out.println("\n");
		mostrarDeportista();
		System.out.println("\n");
		mostrarDoctor();
		System.out.println("\n");
		mostrarEstudiante();
		System.out.println("\n");
		mostrarLicenciado();
		
	}
	
	public static void borrar() {//metodo que borara segun el tipo de contacto y nombre
		borrarPersona();
	}
	
	public static void remplazar() {
		remplazarPersona();
	}
	public static int menuPrincipal() {//este metodo muestra y obtiene una repuesta del menu principal de la aplicacion
		Scanner in = new Scanner(System.in);//declaracion de la clase Scanner para pedir una opcion
		System.out.println("\n");
		System.out.print("      MENU\n1.-Agregar contacto\n2.-Mostrar contactos\n"+
		"\n3.-Borrar Contacto\n4.-Salir\n"+"Selecciona una opcion: ");//menu visible para elegir una opcion
	
		int opcion = in.nextInt();//variable que guarda la respuesta
		return opcion;//regresa la opcion que se cacha en la clase principal
	}
	
	public static int menuContacto() {//este metodo muestra y obtiene una respuesta para agregar el tipo de contacto, este metodo esta implementado en la clase principal UsoContacto
		Scanner in = new Scanner(System.in);//declaracion de la clase Scanner para pedir una opcion
		System.out.print("\n\n1.-Persona\n2.-Deportista\n3.-Doctor\n4.-Estudiante\n"+
				"5.-Licenciado\n"+"Selecciona tipo de contacto: ");//menu visible para elegir opcion
		int opcion = in.nextInt();//variable que guarda la respuesta
		System.out.println("\n");
		return opcion;//regresa la opcion que se cacha en la clase principal
	}
}

