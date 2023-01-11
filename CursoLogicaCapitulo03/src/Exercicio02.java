import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faca a impressao do nome e sobrenome da pessoa

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome:");
		String nome = scanner.nextLine();
		System.out.println("Informe o sobrenome:");
		String sobrenome = scanner.nextLine();
		System.out.println("Nome completo: " + nome + " " + sobrenome);
		scanner.close();

	}

}
