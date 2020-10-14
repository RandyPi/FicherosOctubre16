import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Nuevo_alumno {

	public void nuevo () {
		Scanner entrada = new Scanner(System.in);
		String Alumno = entrada.nextLine();
		
		try {
			FileWriter nuevoAlumno = new FileWriter("C:\\Users\\randy\\AccesoADatos\\Alumno.txt", true);
			
			for (int i = 0; i<Alumno.length(); i++) {
				nuevoAlumno.write(Alumno.charAt(i));
			}
			nuevoAlumno.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
}
