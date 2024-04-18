import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20]; // Vetor resultante da intercalação

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[j++] = vetor1[i];
            vetorIntercalado[j++] = vetor2[i];
        }

        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
    }
}
