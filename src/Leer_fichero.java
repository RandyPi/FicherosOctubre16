import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Leer_fichero {
	 Scanner entrada = null;
     String linea;
     int numeroDeLinea = 1;
     boolean contiene = false;
     Scanner sc = new Scanner(System.in);

	public void lee() {
		
		try {
			//Creacion del lector de fichero
			FileReader Alumnos = new FileReader ("C:\\Users\\randy\\AccesoADatos\\Alumno.txt");
			//Creacion de la memoria intermedia
			BufferedReader guardado = new BufferedReader(Alumnos);
			
			String line = "";
			//Mientras no sea nula va a ir leyendo la linea
			while (line != null) {
				//Lo que hay almacenado en el buffer se iguala al String line
				line = guardado.readLine();
				//Para eliminar el null del final de la lista
				if(line != null) {
				System.out.println(line);
				}	
			}
			
			Alumnos.close();
			
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
	
	public void buscarAlumno() {

		  	Scanner entrada = null;
	        String linea;
	        int numeroDeLinea = 1;
	        boolean contiene = false;
	        Scanner sc = new Scanner(System.in);
		
	        System.out.print("Introduce el DNI a buscar: ");
		    String Dni = sc.nextLine();
		    
		try {
			//Creacion del lector de fichero
			FileReader Alumnos = new FileReader ("C:\\Users\\randy\\AccesoADatos\\Alumno.txt");
			//Creacion de la memoria intermedia
			BufferedReader guardado = new BufferedReader(Alumnos);
		
			 //creamos un Scanner para leer el fichero
            entrada = new Scanner(guardado);
			
          //mostramos el alumno a buscar
            System.out.println("Alumno a buscar: " + Dni);
            while (entrada.hasNext()) { //mientras no se llegue al final del fichero
                linea = entrada.nextLine();  //se lee una línea
                if (linea.contains(Dni)) {   //si la línea contiene el Dni buscado se muestra por pantalla         
                	System.out.println("Alumno " + numeroDeLinea + ": " + linea);
                }
                numeroDeLinea++; //se incrementa el contador de líneas         
            }
            if(!contiene){ //si el archivo no contienen el alumno se muestra un mensaje indicandolo
                
            }else {
            	System.out.println("No existe ese alumno");
            } 
            
			guardado.close();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
	}
	
}

/* 
 
 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class BurcarTextoEnArchivo {

    public static void main(String[] args) {

        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);

        //Para seleccionar el archivo
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(j);

        //Introducimos el texto a buscar
        System.out.print("Introduce texto a buscar: ");
        String texto = sc.nextLine();

        try {
            //guardamos el path del fichero en la variable ruta
            String ruta = j.getSelectedFile().getAbsolutePath();
            //creamos un objeto File asociado al fichero seleccionado
            File f = new File(ruta);
            //creamos un Scanner para leer el fichero
            entrada = new Scanner(f);
            //mostramos el nombre del fichero
            System.out.println("Archivo: " + f.getName());
            //mostramos el texto a buscar
            System.out.println("Texto a buscar: " + texto);
            while (entrada.hasNext()) { //mientras no se llegue al final del fichero
                linea = entrada.nextLine();  //se lee una línea
                if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla         
                    System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    contiene = true;
                }
                numeroDeLinea++; //se incrementa el contador de líneas
            }
            if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo

                System.out.println(texto + " no se ha encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
}//Fin programa de búsqueda de texto en un archivo 
  
 */
