import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosVoo = new int[12];
        String[] origens = new String[12];
        String[] destinos = new String[12];
        int[] lugaresDisponiveis = new int[12];

        // Menu principal
        int opcao;
        do {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar reserva");
            System.out.println("3. Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultar(scanner, numerosVoo, origens, destinos, lugaresDisponiveis);
                    break;
                case 2:
                    efetuarReserva(scanner, numerosVoo, lugaresDisponiveis);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void consultar(Scanner scanner, int[] numerosVoo, String[] origens, String[] destinos, int[] lugaresDisponiveis) {
        System.out.println("\nCONSULTAR:");
        System.out.println("1. Por número do voo");
        System.out.println("2. Por origem");
        System.out.println("3. Por destino");
        System.out.print("Escolha a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o número do voo: ");
                int numeroVoo = scanner.nextInt();
                int indice = buscarIndicePorNumeroVoo(numeroVoo, numerosVoo);
                if (indice != -1) {
                    System.out.println("Origem: " + origens[indice]);
                    System.out.println("Destino: " + destinos[indice]);
                    System.out.println("Lugares disponíveis: " + lugaresDisponiveis[indice]);
                } else {
                    System.out.println("Voo inexistente.");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public static void efetuarReserva(Scanner scanner, int[] numerosVoo, int[] lugaresDisponiveis) {
        System.out.print("Digite o número do voo: ");
        int numeroVoo = scanner.nextInt();
        int indice = buscarIndicePorNumeroVoo(numeroVoo, numerosVoo);
        if (indice != -1) {
            if (lugaresDisponiveis[indice] > 0) {
                lugaresDisponiveis[indice]--;
                System.out.println("Reserva confirmada.");
            } else {
                System.out.println("Voo lotado.");
            }
        } else {
            System.out.println("Voo inexistente.");
        }
    }

    public static int buscarIndicePorNumeroVoo(int numeroVoo, int[] numerosVoo) {
        for (int i = 0; i < numerosVoo.length; i++) {
            if (numerosVoo[i] == numeroVoo) {
                return i;
            }
        }
        return -1;
    }
}
