package Principal;

import java.io.IOException;

import Metodos.MetodosPrincipal;//importamos el paquete que contiene la clase con los metodos
public class UsoContacto extends MetodosPrincipal{//extendemos de la clase MetodosPrincipal para extraer los petodos utilizados

	private static boolean salir=true;//variable que permite terminar el ciclo del while
	public static void main(String[] args) {
		try{
			while(salir==true) {
				int opcion_menu = menuPrincipal();//metodo que extrae el menu principal y la respuesta de la clase MetodosPrincipal
				switch(opcion_menu) {
					case 1://opcion para agregar datos
						
						int opcionContacto = menuContacto();//metodo que extrae el menu y la respuesta del contacto a agregar de la clase MetodosPrincipal
						agregar(opcionContacto);//metodo: recibe la respuesta con la cual agrega el tipo de contacto en la clase MetodosPrincipal
						break;
					case 2://opcion para mostrar datos
						mostrar();//metodo: extrae metodos de cada contacto para mostrar todos los contactos
						break;
					case 3://opcion para borrar datos
	
						opcionContacto=menuContacto();
						borrar(opcionContacto);//metodo: extrae metodos de cada contacto para borrar por tipo de contacto y su nombre 
						break;
					case 4://opcion para remplazar algun dato por tipo de contacto
						//remplazar();
						break;
					case 5://opcion para salir de la aplicacion
						salir=false;
						System.out.println("¡Aplicacion terminada!");
						break;
				}
			}
		}
		catch(Exception e){
			System.out.println("¡Para los menus solo se admiten numeros!");
			UsoContacto.main(null);
		}
	}
}
