import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Verificar se aluno passou de ano

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a nota do aluno(a):");
		Double nota = scanner.nextDouble();

		if (nota > 70) {
			System.out.println("Aluno(a) passou de ano!");
		} else {
			System.out.println("Aluno(a) fcou de recuperação!");
		}

	}

}
