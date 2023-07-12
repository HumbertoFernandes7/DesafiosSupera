import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de numeros do array: ");
        int tamanhoArray = scan.nextInt();
        
        System.out.println("Digite o valor alvo: ");
        int valorAlvo = scan.nextInt();

        
        System.out.println("Digite " + tamanhoArray + " numeros: ");
        int[] arr = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            arr[i] = scan.nextInt();
        }

        int resultado = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            for (int j = i + 1; j < tamanhoArray; j++) {
                if (Math.abs(arr[i] - arr[j]) == valorAlvo) {
                	resultado++;
                }
            }
        }

        System.out.println(resultado);
        
        scan.close();
    }
}