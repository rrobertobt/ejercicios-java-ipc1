import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca la posición de la serie que desea saber");
		System.out.print("> ");
		int index = input.nextInt();
		int n = index+1;


		System.out.println("La secuencia de Fibonacci hasta la posicion "+index+" es:");
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i)+" ");
		}

	}

	public static int fib(int n){
		if(n == 0 || n == 1){
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}