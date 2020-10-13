import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
	
	//File Alumno_aux = new File (C, "Alumno_aux.txt");
	
	String Dni= "";
	String NPC = "";
	//Scanner teclado = new Scanner (System.in);
	//int opcion =0;
	
		System.out.println("1 Alta alumnos");
		System.out.println("2:Bajas de alumnos");
		System.out.println("3: Modificar alumnos");
		System.out.println("4: Ver alumno");
	
	//opcion = teclado.nextInt();
	
	//switch (opcion) {
	//case 1: 
		try {
			File C = new File ("C:\\Users\\randy\\AccesoADatos");
			C.mkdir();
			File Alumno = new File (C, "Alumno.txt");
			FileWriter fic = new FileWriter(Alumno);
			String cadena = "Nuevos alumnos: ";
			
			char[] cad = cadena.toCharArray();
			
			for (int i = 0; i<cad.length; i++) {
				fic.write(cad[i]);
				
				fic.append('*');
				fic.close();
			}
			
		}catch (IOException e) {e.printStackTrace();}
		//break;
	}
	
	
	
	
		
	}
	
	

