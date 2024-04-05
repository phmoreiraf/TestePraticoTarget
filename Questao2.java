import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número para verificar se está na sequência de Fibonacci
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Função para verificar se um número está na sequência de Fibonacci
    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;

        // Calcula a sequência de Fibonacci até encontrar um número igual ou maior que o número especificado
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        // Se chegou aqui, o número não está na sequência de Fibonacci
        return false;
    }
}
