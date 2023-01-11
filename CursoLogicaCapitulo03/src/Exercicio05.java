import java.util.Scanner;

public class Exercicio05 {

	static final Integer NOTA_CORTE_APROVACAO = 70;

	public static void main(String[] args) {
		// Verificar se aluno passou de ano

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a nota do aluno(a):");
		Double nota = scanner.nextDouble();

		if (nota > NOTA_CORTE_APROVACAO) {
			System.out.println("Aluno(a) passou de ano!");
		} else {
			System.out.println("Aluno(a) fcou de recuperação!");
		}

	}

}
