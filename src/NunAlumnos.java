import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NunAlumnos {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader ( new FileReader("C:\\PRUEBAS\\DAM1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\PRUEBAS\\DAM2.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\PRUEBAS\\numeroAlumnosList.txt"));
		String alumnoLinea;
		ArrayList<Alumno>alumnosDam1 = new ArrayList<Alumno>();
		ArrayList<Alumno>alumnosDam2 = new ArrayList<Alumno>();
		
		String[]valoresAlumno;
		Alumno alumno = null;
		
		while((alumnoLinea = br1.readLine()) != null) {
			valoresAlumno = alumnoLinea.split(" ");
			alumno = new Alumno(valoresAlumno[0], valoresAlumno[1]);
			alumnosDam1.add(alumno);
		}
				
		while((alumnoLinea = br2.readLine()) != null) {
			valoresAlumno =alumnoLinea.split(" ");
			alumno = new Alumno(valoresAlumno[0], valoresAlumno[1]);
			alumnosDam2.add(alumno);
		}
			

		bw.write("el numero de alumnos de Dam1 es: "+ alumnosDam1.size() +"\rel numero de alumnos de Dam2 es: "+ alumnosDam2.size());
		bw.flush();
		bw.close();
		br1.close();
		br2.close();

	}
	
}
