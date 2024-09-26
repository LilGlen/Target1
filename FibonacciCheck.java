import java.util.Scanner;

public class FibonacciCheck{

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false; // Números negativos não pertencem à sequência
        }
        
        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0, b = 1;
        
        // Caso o número seja 0 ou 1, ele pertence à sequência
        if (n == a || n == b) {
            return true;
        }
        
        // Calcula a sequência até que o valor atual seja maior ou igual ao número informado
        int next = a + b;
        while (next <= n) {
            if (next == n) {
                return true; // O número informado pertence à sequência
            }
            a = b;
            b = next;
            next = a + b;
        }
        
        return false; // O número informado não pertence à sequência
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário informe um número
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        // Verifica se o número informado pertence à sequência de Fibonacci
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
