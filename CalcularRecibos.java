import java.util.Scanner;

public class CalcularRecibos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int repeat = 1;

		while (repeat == 1) {
			
			System.out.println("Que accion desea realizar?: Escriba el numero segun la opcion");
			System.out.println("1: Calcular recibo de agua");
			System.out.println("2: Calcular recibo de luz");
			System.out.println("3: Salir");
			System.out.print("> ");

			int seleccion = scanner.nextInt();

			if (seleccion == 1) {
				
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

			} else {
				if (seleccion == 2) {
					
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

				} else {
					if (seleccion == 3) {
						System.out.println("Saliendo de programa...");
						repeat = 0;
					} else {
						System.out.println("Opcion no valida, intentar de nuevo");
					}
				}
				
			}


		}

	}

}