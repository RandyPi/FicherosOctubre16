import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public Scanner teclado;
	public Scanner entrada;

	
	public static void main(String[] args) {
	
		Main miLista = new Main();
		miLista.leerOpcion();
		}	
	
	public void leerOpcion() {
		
		teclado = new Scanner (System.in);
		
		int opcion=0;
		do {
			System.out.println("**********************");
			System.out.println("Seleccione una opcion");
			System.out.println("**********************"); 
			System.out.println("1: Agregar Alumno");
			System.out.println("2: Lista de Alumnos");
			System.out.println("3: Buscar Alumno");
			System.out.println("4: Eliminar a Alumno");;
			System.out.println("6: Salir");
			
			opcion = teclado.nextInt();
		
		switch (opcion) {

		case 1: 
			Nuevo_alumno nuevo =  new Nuevo_alumno ();	
			nuevo.nuevo();
			        
			break;
			
		case 2: 
			Leer_fichero leeUno = new Leer_fichero();
			leeUno.lee();
		
			break;
		
		case 3:
			Leer_fichero leeTodo = new Leer_fichero();
			leeTodo.buscarAlumno();
			break;
			
		case 4: 
			Borrar_alumno borra = new Borrar_alumno();
			borra.borra();
			
			break;
			
		}
		} while (opcion != 5);
		}
		
	/*
	
	//nuevo.nuevo();
	
	
	Borrar_alumno accesoAlumno = new Borrar_alumno();
	accesoAlumno.borra();
	*/
	}	


