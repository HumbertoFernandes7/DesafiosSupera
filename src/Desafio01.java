import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> listaNumeros = new ArrayList<>();

		System.out.println("Digite a quantidade de numeros: ");
		int quantidadeNumeros = scan.nextInt();

		System.out.println("Agora digite " + quantidadeNumeros + " numeros: ");
		for (int i = 0; i < quantidadeNumeros; i++) {
			int numeroDigitado = scan.nextInt();
			listaNumeros.add(numeroDigitado);
		}

		Comparator<Integer> comparadorPares = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (a % 2 == 0 && b % 2 == 0) {
					return a - b;
				} else if (a % 2 == 0) {
					return -1;
				} else if (b % 2 == 0) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Comparator<Integer> comparadorImpares = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (a % 2 != 0 && b % 2 != 0) {
					return b - a;
				} else if (a % 2 != 0) {
					return -1;
				} else if (b % 2 != 0) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(listaNumeros, comparadorImpares);
		Collections.sort(listaNumeros, comparadorPares);

		for (Integer valor : listaNumeros) {
			System.out.println(valor);
		}

		scan.close();
	}
}
