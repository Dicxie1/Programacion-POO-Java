package unidad2;
/**
 * Program que explica el uso de las sentencias Switch en Java
 * @author dicxie
 *
 */
import java.util.Scanner;
public class SentenciasSwitch {
	public static void main(String[] args) {
		//delcaracion de variable
		Scanner sc = new Scanner(System.in);
		int semana = sc.nextInt(); //caputura los datos por teclado
		System.out.println("Ingrese un numero de semana: ");
		switch(semana) { 
		case 1:
			System.out.println("Lunes"); //si variable es 1 imprime Lunes 
			break;
		case 2:
			System.out.println("Martes"); //si variable es 1 imprime Lunes 
			break;
		case 3:
			System.out.println("Miércoles"); //si variable es 1 imprime Lunes 
			break;
		case 4:
			System.out.println("Jueves"); //si variable es 1 imprime Lunes 
			break;
		case 5:
			System.out.println("Vienes"); //si variable es 1 imprime Lunes 
			break;
		case 6:
			System.out.println("Sábado"); //si variable es 1 imprime Lunes 
			break;
		case 7:
			System.out.println("Domingo"); //si variable es 1 imprime Lunes 
			break;
		default:
			System.out.println("No existe ese día"); //si variable es 1 imprime Lunes 
			break;
				
		}
	}

}
