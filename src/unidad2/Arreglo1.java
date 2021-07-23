package unidad2;

public class Arreglo1 {

	public static void main(String[] args) {
		//declaración del arreglo
		int numeros[] = {10, 20, 30, 40, 50, 70};
		//mostrar por pantalla la cantidad de elementos que tiene 
		System.out.println("la cantidad de elementos que tine son :" + numeros.length);
		//aceder a los elementos del arreglos  
		System.out.println("el primer elementos es :" + numeros[0]);
		//ultimo elementos es numero.length -1
		System.out.println("el ultimo elemento es :" + numeros[5]); // numeros[numeros.length-1]
		//Asignacion de valores
		numeros[0] = 130; // asingando un nuevo valor en la primera posición
		numeros[numeros.length-1] = 200;
		System.out.println("el primer elementos es :" + numeros[0]);
		//ultimo elementos es numero.length -1
		System.out.println("el ultimo elemento es :" + numeros[5]); 
		System.out.println("Fin del programa" );
		
	}

}
