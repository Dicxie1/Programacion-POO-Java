package unidad2;
import java.util.Scanner;

public class PruebaLibroCalificación {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LibroCalificacion miLibroCalificacion = new LibroCalificacion();
		System.out.println("Escribe el nombre del curso: ");
		String nombreDelCurso = entrada.nextLine();
		//metodos que establece el nombre del curso
		miLibroCalificacion.establecerNombreDelCurso(nombreDelCurso);
	}
}
