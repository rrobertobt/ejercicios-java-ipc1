import java.util.Scanner;

public class VentasProductos {
	public static void main(String[] args) {
		
		Scanner kinput = new Scanner(System.in);

		// consultamos y guardamos cantidad de productos
		System.out.println("¿Cuantos productos va a ingresar?");
		System.out.print("> ");
		int n = kinput.nextInt();

		// declaramos e inicializamos arreglos y variables de los productos
		String[] product = new String[n];
		int[] soldQuantity = new int[n];
		int totalSales = 0;
		String leastSoldName = " ";
		String mostSoldName = " ";

		for (int i = 0; i < n; i++) {
			
			// obtenemos el nombre y cantidad ventas de cada producto
			System.out.println("Ingrese nombre del producto #"+(i+1));
			System.out.print("> ");
			product[i] = kinput.next();
			System.out.println("Ingrese cantidad de unidades vendidas del producto #"+(i+1));
			System.out.print("> ");
			soldQuantity[i] = kinput.nextInt();

		}
		
		// asignamos el primer elemento de las cantidades de ventas como pivote
		// para hacer las primeras comparaciones
		int leastSold = soldQuantity[0];
		int mostSold = soldQuantity[0];

		// buscamos el mayor y menor vendido, y lo guardamos junto con su nombre
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (soldQuantity[i] > mostSold) {
					mostSold = soldQuantity[i];
					mostSoldName = product[i];
				} else if (soldQuantity[i] < leastSold){
					leastSold = soldQuantity[i];
					leastSoldName = product[i];
				}					
			}


		}

		// mostramos el mayor y menor
		System.out.println("El producto mas vendido es: " + mostSoldName + " con: " + mostSold + " unidades");
		System.out.println("El producto menos vendido es: " + leastSoldName + " con: " + leastSold + " unidades");


		// calculamos la suma de todas las ventas
		for (int i = 0; i < n; i++) {
			totalSales = totalSales + soldQuantity[i];
		}

		System.out.println("El total de ventas es de: " + totalSales + " unidades, por: " + n + " productos");
			
		}
	}
	