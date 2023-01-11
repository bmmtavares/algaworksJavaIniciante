import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Calculando o quadrado de um numero

		Scanner scanner = new Scanner(System.in);
		System.out.println("---Calculando o quadrado de um numero---");
		System.out.println("Informe um numero:");
		Integer numero = scanner.nextInt();
		Integer quadrado = numero * numero;
		System.out.println("O quadrado de " + numero + " = " + quadrado);
		scanner.close();

	}
}
