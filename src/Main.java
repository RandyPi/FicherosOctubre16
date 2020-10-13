import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
	File C = new File ("C:\\Users\\randy\\AccesoADatos");
	C.mkdir();
	
	File Alumno = new File (C, "Alumno.txt");
	File Alumno_aux = new File (C, "Alumno_aux.txt");
	
	String Dni= "";
	String NPC = "";
	
		System.out.println("1 Alta alumnos");
		System.out.println("2:Bajas de alumnos");
		System.out.println("3: Modificar alumnos");
		System.out.println("4: Ver alumno");
	
	int seleccion =0;
	
	switch (seleccion) {
	case 1: 
		try {
			if (Alumno.createNewFile()) {
				System.out.println("Se ha creado");
			}else {
				
				System.out.println("No se ha podido crear el fichero");
				
			}
			
		}catch (IOException e) {e.printStackTrace();}
		
		break;
	}
	
	
	
	
		
	}
	}
	

