import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];

        System.out.println("Digite os oito números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = scanner.nextInt();
        }

        int contPositivos = 0;
        int contNegativos = 0;
        for (int i = 0; i < 8; i++) {
            if (vetor[i] >= 0) {
                positivos[contPositivos++] = vetor[i];
            } else {
                negativos[contNegativos++] = vetor[i];
            }
        }

        System.out.println("Números positivos:");
        for (int i = 0; i < contPositivos; i++) {
            System.out.print(positivos[i] + " ");
        }

        System.out.println("\nNúmeros negativos:");
        for (int i = 0; i < contNegativos; i++) {
            System.out.print(negativos[i] + " ");
        }
    }
}
