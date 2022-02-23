import java.util.Scanner;

public class CalcularAgua {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cuotaBase = 20;
		int tarifaAgua1 = 5;
		double tarifaAgua2 = 6.5;
		double totalAgua = 0;
		
		System.out.println("Ingresar cantidad de agua consumida en m^3");
		int consumoAgua = scanner.nextInt();

		if (consumoAgua <= 5) {
			System.out.println("El precio a pagar por el consumo de agua es de: " + cuotaBase);
		} else {
			if (consumoAgua > 5 && consumoAgua <= 15) {
				totalAgua = ((consumoAgua - 5) * tarifaAgua1) + cuotaBase;
				System.out.println("El precio a pagar por el consumo de agua es de: " + totalAgua);
			} else {
				if (consumoAgua > 15) {
					double previo = (15 - 5) * 5;
					double calculo = (consumoAgua - 15) * tarifaAgua2;
					totalAgua = cuotaBase + previo + calculo;
					System.out.println("El precio a pagar por el consumo de agua es de: " + totalAgua);
				}
			}
		}

	}
}