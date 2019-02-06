
public class Girar_Matriz { /* Girar Matriz */

	static int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };

	public static void main(String[] args) {

		System.out.println("MATRIZ ORIGINAL\n");
		imprimirMatriz();
		girar90Izquierda();
		// girar90Derecha();
		imprimirMatriz();

	}

	static public void imprimirMatriz() {

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz[f][c] + "  ");
			}

			System.out.println("\n");

		}

	}

	static public void girar90Derecha() {

		System.out.println("MATRIZ GIRADA 90º A LA DERECHA\n");

		int[][] matrizGirada = new int[3][3];
		int contadorf = 2;
		int contadorC = 0;

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 3; c++) {
				matrizGirada[f][c] = matriz[contadorf][contadorC];
				contadorf--;
			}
			contadorC++;
			contadorf = 2;
		}

		matriz = matrizGirada;

	}

	static public void girar90Izquierda() {

		System.out.println("MATRIZ GIRADA 90º A LA IZQUIERDA\n");

		int[][] matrizGirada = new int[3][3];
		int contadorf = 0;
		int contadorC = 2;

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 3; c++) {
				matrizGirada[f][c] = matriz[contadorf][contadorC];
				contadorf++;
			}
			contadorC--;
			contadorf = 0;
		}

		matriz = matrizGirada;

	}

	static public void espejoVertical() {

		int[][] matrizGirada = new int[3][3];
		int contador = 0;

		for (int f = 2; f >= 0; f--) {
			for (int c = 0; c < 3; c++) {
				matrizGirada[contador][c] = matriz[f][c];
			}
			contador++;
		}

		matriz = matrizGirada;

	}

}
