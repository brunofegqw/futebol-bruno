package trim1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroTimes = 5;
        int numeroJogadores = 11;

        double somaIdades = 0;
        double somaPesos = 0;
        double somaAlturas = 0;
        int totalJogadores = numeroTimes * numeroJogadores;

        for (int i = 1; i <= numeroTimes; i++) {
            for (int j = 1; j <= numeroJogadores; j++) {
                System.out.println("Digite a idade do jogador " + j + " do time " + i + ":");
                int idade = scanner.nextInt();
                System.out.println("Digite o peso do jogador " + j + " do time " + i + " (em kg):");
                double peso = scanner.nextDouble();
                System.out.println("Digite a altura do jogador " + j + " do time " + i + " (em metros):");
                double altura = scanner.nextDouble();

                somaIdades += idade;
                somaPesos += peso;
                somaAlturas += altura;
            }
        }

        double mediaIdades = somaIdades / totalJogadores;
        double mediaPesos = somaPesos / totalJogadores;
        double mediaAlturas = somaAlturas / totalJogadores;

        System.out.println("Estatísticas dos jogadores:");
        System.out.println("Média de idades: " + mediaIdades);
        System.out.println("Média de pesos: " + mediaPesos + " kg");
        System.out.println("Média de alturas: " + mediaAlturas + " metros");

        scanner.close();
    }
}
