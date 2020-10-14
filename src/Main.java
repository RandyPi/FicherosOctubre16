import java.io.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
	Nuevo_alumno nuevo =  new Nuevo_alumno ();	
	nuevo.nuevo();
	
	Leer_fichero accesoAlumno = new Leer_fichero();
	accesoAlumno.lee();
	
	}	
}
	

