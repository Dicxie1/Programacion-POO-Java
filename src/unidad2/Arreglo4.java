package unidad2;

public class Arreglo4 {

	public static void main(String[] args) {
		int num[] = new int[12];
		//inicializar los valores del arreglo
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		//imprimir 
		System.out.println("Imprimir los valores del arreglo");
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
