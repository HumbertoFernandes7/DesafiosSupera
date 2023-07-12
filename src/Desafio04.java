import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de frases: ");
		int quantidadeFrases = scan.nextInt();
		scan.nextLine();

		System.out.println("Digite " + quantidadeFrases + " frases embaralhadas: ");
		for (int i = 0; i < quantidadeFrases; i++) {
			String linha = scan.nextLine();
			int meio = linha.length() / 2;
			StringBuilder fraseDecifrada = new StringBuilder();

			for (int j = linha.length() - 1; j >= 0; j--) {
				char caractere = linha.charAt(j);
				if (j >= meio) {
					fraseDecifrada.append(caractere);
				} else {
					fraseDecifrada.insert(meio - j - 1, caractere);
				}
			}

			System.out.println(fraseDecifrada.toString());
		}
		scan.close();
	}
}
