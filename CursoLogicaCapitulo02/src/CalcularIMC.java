import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o peso em kg: ");
		Double peso = scanner.nextDouble();

		System.out.print("Informe a altura metros: ");
		Double altura = scanner.nextDouble();

		Double imc = peso/(altura * altura);

		System.out.println("Resultado do IMC: " + imc);
		
		scanner.close();
	}
}
