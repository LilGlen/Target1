import java.util.Scanner;

public class ConteA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário informe uma string
        System.out.print("Diga uma palavra ou frase: ");
        String b = scanner.nextLine();

        // Variável para armazenar a contagem da string 'a' e 'A'
        int count = 0;

        // Loop que varre a string e procura: 'a' e 'A'
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        // Exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}

