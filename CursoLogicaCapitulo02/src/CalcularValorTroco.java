import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		// System.out.println("Exercício 01: Alterando a mensagem de Olá!");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite a qtd passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();

		Double resultado = valorPassadoPeloCliente - valorProduto;

		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}
}
