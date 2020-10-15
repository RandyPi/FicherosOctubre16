import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Borrar_alumno {

	public void borra () {
		
	  	Scanner entrada = null;
        String linea ="";
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);
	
        System.out.print("Introduce texto a buscar: ");
	    String Dni = sc.nextLine();
	    
	try {
		BufferedReader guardado = new BufferedReader(new FileReader ("C:\\Users\\randy\\AccesoADatos\\Alumno.txt"));
		//Creacion del fichero auxiliar
		BufferedWriter Alumnos_aux = new BufferedWriter(new FileWriter("C:\\Users\\randy\\AccesoADatos\\Alumno_aux.txt", true));
		 //creamos un Scanner para leer el fichero
        entrada = new Scanner(guardado);
		
      //mostramos el alumno a buscar
        System.out.println("Alumno a eliminar: " + Dni);
        
        while (entrada.hasNext()) { //mientras no se llegue al final del fichero
            linea = entrada.nextLine();  //se lee una línea
            if (linea.contains(Dni)) {   //si la línea contiene el Dni    
            	
            		Alumnos_aux.write(linea);
            		Alumnos_aux.newLine();
            		
            		File fichTemp = new File ("C:\\Users\\randy\\AccesoADatos\\Alumno_aux.txt");
            		File fichOrigin = new File ("C:\\Users\\randy\\AccesoADatos\\Alumno.txt");
            		fichOrigin.delete();
            		fichTemp.renameTo(fichOrigin);
            		
            		Alumnos_aux.close();
            		guardado.close();
            		
            		
            		
            } else {
            	System.out.println("Alumno dado de baja");
            }
  
        }
        if(!contiene){ //si el archivo no contienen el alumno se muestra un mensaje indicandolo

            System.out.println(Dni + "No existe ese alumno");
        }   
        
		
	}catch (IOException e) {
		
		e.printStackTrace();
	}

	

	}
	
	public void modifica() {
		
	}
}
