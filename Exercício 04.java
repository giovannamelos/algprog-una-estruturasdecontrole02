import java.util.Scanner;

public class QuestaoMultiplaEscolha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char resposta;
        int tentativa = 1;
        boolean acertou = false;

        do {
            System.out.println("\n=== QUESTÃO ===");
            System.out.println("O que é um algoritmo?");
            System.out.println("a) Um tipo de computador");
            System.out.println("b) Uma sequência de passos para resolver um problema");
            System.out.println("c) Um programa pronto");
            System.out.println("d) Um erro no sistema");
            System.out.println("e) Um tipo de memória");

            System.out.print("Escolha uma opção (a, b, c, d, e): ");
            resposta = scanner.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'b':
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na tentativa " + tentativa);
                    acertou = true;
                    break;

                case 'a':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("Resposta incorreta.");
                    tentativa++;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!acertou && tentativa <= 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }

        scanner.close();
    }
}
