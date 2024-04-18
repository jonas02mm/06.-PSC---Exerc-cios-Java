import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[9];

        System.out.println("Digite nove números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números primos e suas posições:");

        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("Número primo: " + vetor[i] + " - Posição: " + i);
            }
        }

        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
