import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Valor produto:");
		Double valorProduto = scanner.nextDouble();

		System.out.println("Qtd produto:");
		Integer qtdProduto = scanner.nextInt();

		Double subtotal = valorProduto * qtdProduto;

		Boolean aplicarDesconto = qtdProduto > 10;

		Double desconto = 0.0;
		if (aplicarDesconto) {
			desconto = 10.0;
		}

		Double vlDesconto = (subtotal * desconto) / 100;

		subtotal = subtotal - vlDesconto;

		System.out.println("Valor total: " + subtotal + " com desonto de: " + desconto + "%");
	}

}
