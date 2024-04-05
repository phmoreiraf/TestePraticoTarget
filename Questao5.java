import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a string
        System.out.print("Digite uma string para inverter seus caracteres: ");
        String original = scanner.nextLine();

        // Chama a função para inverter a string
        String invertida = inverterString(original);

        // Exibe a string invertida
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    // Função para inverter uma string
    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();
        int tamanho = caracteres.length;
        char[] invertido = new char[tamanho];

        // Inverte os caracteres
        for (int i = 0; i < tamanho; i++) {
            invertido[i] = caracteres[tamanho - 1 - i];
        }

        return new String(invertido);
    }
}
