package unidad2;
import java.util.Scanner;
public class Arreeglo5 {
	public static void main(String[] args) {
		int N ;
		int total = 1;
		Scanner sc = new Scanner(System.in); //para leer por teclado 
		System.out.println("¿Cuantos valores desea ingresar?");
		N = sc.nextInt();
		int arreglo[] = new int[N];
		//introducir los elementos en el arregllo
		for(int i = 0; i < arreglo.length; i++) {
			System.out.printf("numero %d", i+1);
			arreglo[i] = sc.nextInt();
		}
		for(int i = 0; i < arreglo.length; i++) {
			total *= arreglo[i];
		}
		//visualizacion de resultado
		System.out.println("el producto del arreglo es :" + total);
	}

}
