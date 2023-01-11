import java.util.Scanner;

public class TipoTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// String mensagemSaudacao = "Olá!";
		String nome = scanner.nextLine();// "Bruno";
		// System.out.println(mensagemSaudacao);
		System.out.println("Olá " + nome + "!");
		scanner.close();

		Character variavelCharacter = 'A';
	}
}
