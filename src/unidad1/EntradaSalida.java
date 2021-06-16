package unidad1;
/**
 * el programa que pida por al usuario que ingrese por teclado dos valores 
 * y muestre por pantalla el resultado 
 * @author dicxie
 *
 */
import java.util.Scanner; // Se importa las clase utiliza para obtener datos por teclado
public class EntradaSalida {

	public static void main(String[] args) {
		//Delcaracion de variables 
		int valor1;
		int valor2;
		int resultado;
		Scanner sc = new Scanner(System.in); // se crea un objeto de la clase Scanner 
		System.out.println("Ingrese un número: ");
		valor1 = sc.nextInt(); // método que captura datos entero por teclado y lo almacena en valor1
		System.out.println("Ingrese un número: ");
		valor2 = sc.nextInt(); // método que captura datos entero por teclado y lo almacena en valor2
		//se realiza la suma de y  se almacena en la variable resultado
		resultado = valor1 + valor2;
		System.out.println("La suma de los dos numero es " + resultado);
		

	}

}
