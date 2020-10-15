import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Nuevo_alumno {

	public void nuevo () {
		Scanner entrada = new Scanner(System.in);
		String Alumno = entrada.nextLine();
		
		try {
			
			BufferedWriter crear = new BufferedWriter (new FileWriter("C:\\Users\\randy\\AccesoADatos\\Alumno.txt", true));
			
			for (int i = 0; i<1; i++) {
				crear.write(Alumno);
				crear.newLine();
			}
			crear.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
}
