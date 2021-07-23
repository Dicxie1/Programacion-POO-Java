package unidad2;

public class LibroCalificacion {
	// Nombre del curso para este LibroCalificación
	private String nombreDelCurso;
	// Metodo para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}
	// Metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso() {
		return this.nombreDelCurso;
	}
	// Metodo para mostrar mensaje de bienvenida 
	public void mostrarMensaje() {
		System.out.printf("Bienvenidos al libro de califiación  para\n%s!\n", 
				this.obtenerNombreDelCurso());
	}
	
}

