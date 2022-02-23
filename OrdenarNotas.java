import java.util.Scanner;

public class OrdenarNotas {
	public static void main(String[] args) {
		
		Scanner kbdinput = new Scanner(System.in);
		
		System.out.print("Cuál será la Cantidad de notas que va a Ingresar?: \n");
		System.out.print("> ");

		int cantNotas = kbdinput.nextInt(); // Cantidad de notas a comparar

		// Arryas de notas y nombres
		int[] notas = new int[cantNotas];
		String[] nombres = new String[cantNotas];
		int[] notasMen = new int[cantNotas];
		int[] notasMay = new int[cantNotas];

		// Variables globales
		int cantMen = 0;
		int cantMay = 0;
		int notaMen = 100;
		int notaMay = 0;
		int i = 0;

		// Bloque principal
		while (i < cantNotas) {
			
			System.out.print("Ingrese el nombre: \n");
			nombres[i] = kbdinput.next();
			System.out.print("Ingrese la nota: \n");
			notas[i] = kbdinput.nextInt();
			

			// Encontrar notas menores
			if (notas[i] < notaMen) {
				cantMen = 0;
				notasMen[cantMen] = i;
				cantMen += 1;

			} else if (notas[i] == notaMen) {
				notasMen[cantMen] = i;
				cantMen += 1;
			}


			// Encontrar notas mayores
			if (notas[i] > notaMay) {
				cantMay = 0;
				notasMay[cantMay] = i;
				cantMay += 1;
			} else if (notas[i] == notaMay) {
				notasMay[cantMay] = i;
				cantMay += 1;
			}

			i += 1;

		}

		i = 0;

		System.out.print("Notas menores:\n");

		while (i < cantMen) {
			
			System.out.print(nombres[notasMen[i]] + " = ");
			System.out.println(notas[notasMen[i]]);
			i += 1;

		}

		i = 0;

		System.out.print("Notas mayores:\n");		

		while (i < cantMay) {
			
			System.out.print(nombres[notasMay[i]] + " = ");
			System.out.println(notas[notasMay[i]]);
			i += 1;

		}
	}
}
