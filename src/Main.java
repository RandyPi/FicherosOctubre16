import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
	File C = new File ("C:\\Users\\randy\\AccesoADatos");
	C.mkdir();
	
	File VerAlumno = new File (C, "Veralumnos.txt");
	File NuevoAlum = new File (C, "Nuevoalumno.txt");
	File ModAlumno = new File (C, "DatosModificadosdealumnos.txt");
	String Nombre= "";
	String Apellidos = "";
	String Curso = "";
	
	
	
	try {
		if (NuevoAlum.createNewFile()) {
			System.out.println("Se ha creado");
		}else {
			
			System.out.println("No se ha podido crear");
			
		}if (ModAlumno.createNewFile()) {
			
			System.out.println("Se ha creado");
		}else {
			
			System.out.println("No se ha podido crear");
			
		}if (VerAlumno.createNewFile()) {
			
			System.out.println("Se ha creado");
		}else {
			System.out.println("No se ha podido crear");
		}
		
		
		

		
		
	}catch (IOException e) {e.printStackTrace();}
	
	
		
	}
	}
	

