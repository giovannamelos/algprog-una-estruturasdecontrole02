import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;

        // Percorrendo a string
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

        // Saída
        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros caracteres: " + outros);

        scanner.close();
    }
}