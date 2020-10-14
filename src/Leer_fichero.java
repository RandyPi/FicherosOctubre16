import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_fichero {

	public void lee() {
		
		try {
			//Creacion del lector de fichero
			FileReader Alumnos = new FileReader ("C:\\Users\\randy\\AccesoADatos\\Alumno.txt");
			//Creacion de la memoria intermedia
			BufferedReader guardado = new BufferedReader(Alumnos);
			//Se almacenan los datos en c, igualar a 0 para leer desde la primera posicion 
			int c = 0;
			//Mientras no llegue al final de los caracteres
			while (c!=-1) {
				//c recorrera el lector Alumnos
				c=Alumnos.read();
				//casting de lo que hay almacenado en c para que no imprima caracteres sueltos 
				char letra =(char)c;
				System.out.println(letra);
				
			}
			
			Alumnos.close();
			
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
}
