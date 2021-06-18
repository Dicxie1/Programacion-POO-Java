package unidad2;
/*
 * Programa de java que permite que crea un menu de opciones que permite realizas 
 * 1. sumar dos numero
 * 2. evaluar la accion que toma el vehiculo de acuerdo a la luz del semaforo
 * 3. imprime un por pantalla 'Programación II' 5 veces por pantall
 */
import java.util.Scanner;
public class SentenciaSwitch2 {
	public static void main(String[] args) {
		int opcionMenu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu: ");
		System.out.println("1. sumar dos números enteros");
		System.out.println("2. Semaforo de luz");
		System.out.println("3. Imprimir el mensaje");
		opcionMenu = sc.nextInt();
		switch(opcionMenu) {
		case 1:
			System.out.println("Ingrese un valor :");
			int a = sc.nextInt();
			System.out.println("Ingrese un otro valor :");
			int b = sc.nextInt();
			int resultado = a + b;
			System.out.println("La suma de los valores :" + resultado);
			break;
		case 2:
			System.out.println("De que color esta el semaforo");
			String luz = sc.next();
			if(luz.equals("verde")) {
				System.out.println("Siguen en marcha con el vehiculo");
			}else if(luz.equals("amarrillo")) {
				System.out.println("Disminuye la velocidad vehiculo");
			}else if(luz.equals("rojo")) {
				System.out.println("Deten el auto");
			}else {
				System.out.println("No es un color de semaforo");
			}
			break;
		case 3:
			int i = 0;
			while(i < 5) {
				System.out.println("Programación II");
			}
			break;
		default:
			System.out.println("No es un opcion valida del menu");	
		}
	}
}
