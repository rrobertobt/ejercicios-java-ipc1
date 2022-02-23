import java.util.Scanner;

public class Tableros {
	public static void main(String[] args) {
		
		Scanner kinput = new Scanner(System.in);
		int option;

		do {

			System.out.println("Que tablero desea dibujar?");
			System.out.println("1: Tablero de ajedrez");
			System.out.println("2: Tablero de damas");
			System.out.println("3: Salir");
			System.out.print("> ");
			option = kinput.nextInt();

			if (option == 1) {

				// tablero de ajedrez

				String[][] boardChess = new String [8][8];

				//comprobando cada casilla para asignar elemento correspondiente, usando matrices y sus coordenadas
				// j para columna, i para fila


				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						
						if (j == 1 || j == 6) {
							boardChess[j][i] = "P";
						} else if ( (i == 0 || i == 7) && (j == 0 || j == 7) ) {
							boardChess[j][i] = "T";
						} else if ( (i == 1 || i == 6) && (j == 0 || j == 7) ) {
							boardChess[j][i] = "C";
						} else if ( (i == 2 || i == 5) && (j == 0 || j == 7) ) {
							boardChess[j][i] = "A";
						} else if ( (i == 3) && (j == 0 || j == 7) ) {
							boardChess[j][i] = "D";
						} else if ( (i == 4) && (j == 0 || j == 7)) {
							boardChess[j][i] = "R";
						} else {
							boardChess[j][i] = "";
						}
					}
				}

				// mostrar tablero

				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						System.out.print(boardChess[i][j]);
					}
					System.out.println("");
				}


			} else if (option == 2) {

				// tablero de damas

				String[][] boardCheckers = new String [8][8];

				//comprobando cada casilla para asignar elemento correspondiente, usando matrices y sus coordenadas
				// i para columna, j para fila

				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (((i == 1 || i == 3 || i == 5 || i == 7) && (j == 0 || j == 2)) || ((i == 0 || i == 2 || i == 4 || i == 6) && (j == 1))) {
							boardCheckers[i][j] = "N";
						} else if (((i == 0 || i == 2 || i == 4 || i == 6) && (j == 5 || j == 7)) || ((i == 1 || i == 3 || i == 5 || i == 7) && (j == 6))) {
							boardCheckers[i][j] = "B";
						} else {
							boardCheckers[i][j] = " ";
						}
					}
				}

				// mostrar tablero, por cada fila j, en cada columna i

				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						System.out.print(boardCheckers[j][i]);
					}
					System.out.println("");
				}

			// si el usuario desea salir del programa
			} else if (option == 3) {
				System.out.println("Saliendo...");
			} else { // si se ingresa una opcion que no es valida
				System.out.println("Opción no valida, intentar de nuevo:");
			}

		} while (option != 3);

	}
}
