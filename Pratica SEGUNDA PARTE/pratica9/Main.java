package pratica9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione o método de ordenação:");
            System.out.println("1. Ordenação por Bolha");
            System.out.println("2. Ordenação por Seleção");
            System.out.println("3. Ordenação por Inserção");
            System.out.print("Sua escolha: ");
            int escolha = scanner.nextInt();

            System.out.println("Digite 10 números para serem ordenados:");
            int[] vetor = new int[10];
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            int[] vetorOrdenado;
            switch (escolha) {
                case 1:
                    vetorOrdenado = Ordenacao.bolha(vetor);
                    break;
                case 2:
                    vetorOrdenado = Ordenacao.selecao(vetor);
                    break;
                case 3:
                    vetorOrdenado = Ordenacao.insercao(vetor);
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    continue;
            }

            System.out.println("Vetor ordenado:");
            System.out.println(Arrays.toString(vetorOrdenado));

            System.out.print("Deseja continuar (s/n)? ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}