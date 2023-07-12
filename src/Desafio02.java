import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor com duas casas decimais separados por (,): ");
		float valorDigitado = scan.nextFloat();

		int valorEmCentavos = (int) (valorDigitado * 100);

		int[] notasMoedas = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
		int[] quantidade = new int[notasMoedas.length];

		System.out.println("NOTAS:");

		for (int i = 0; i < notasMoedas.length; i++) {
			quantidade[i] = valorEmCentavos / notasMoedas[i];
			valorEmCentavos %= notasMoedas[i];

			if (notasMoedas[i] >= 100) {
				System.out.printf("%d nota(s) de R$ %.2f\n", quantidade[i], notasMoedas[i] / 100.0);
			} else {
				System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade[i], notasMoedas[i] / 100.0);
			}
		}
		
		scan.close();
	}
}
