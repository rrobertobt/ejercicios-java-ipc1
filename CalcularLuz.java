import java.util.Scanner;

public class CalcularLuz {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int tarifaLuz1 = 1;
		double tarifaLuz2 = 1.5;
		int tarifaLuz3 = 2;
		double totalLuz = 0;
		int consumoLuzPrevio = 50 * tarifaLuz1;
		double consumoLuzMedio = 50 * tarifaLuz2;

		System.out.println("Ingresar cantidad de luz consumida en Kw/h");
		int consumoLuz = scanner.nextInt();		

		if (consumoLuz >= 1 && consumoLuz <= 50) {
			totalLuz = tarifaLuz1 * consumoLuz;
			System.out.println("El precio a pagar por el consumo de luz es de: Q." + totalLuz);
		} else {
			if (consumoLuz > 50 && consumoLuz <= 100) {
				totalLuz = ((consumoLuz - 50)*tarifaLuz2) + consumoLuzPrevio;
				System.out.println("El precio a pagar por el consumo de luz es de: Q." + totalLuz);
			} else {
				if (consumoLuz > 100) {
					totalLuz = ((consumoLuz - 100)*tarifaLuz3) + consumoLuzMedio + consumoLuzPrevio;
					System.out.println("El precio a pagar por el consumo de luz es de: Q." + totalLuz);
				}
				
			}
			
		}

	}
}
