import java.util.Scanner;

public class DescobrirInterruptores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está em uma sala com três interruptores. Você pode ligar e desligar os interruptores quantas vezes quiser.");
        System.out.println("Seu objetivo é descobrir qual interruptor controla qual lâmpada.");

        System.out.println("\nPasso 1:");
        System.out.println("Ligue o primeiro interruptor e aguarde alguns minutos.");

        System.out.println("\nPasso 2:");
        System.out.println("Desligue o primeiro interruptor e ligue o segundo interruptor.");

        System.out.println("\nPasso 3:");
        System.out.println("Entre na sala com as lâmpadas.");

        System.out.print("\nA lâmpada está acesa? (s/n): ");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's' || resposta == 'S') {
            System.out.println("O segundo interruptor está conectado à lâmpada.");
        } else {
            System.out.print("A lâmpada está fria ao toque? (s/n): ");
            resposta = scanner.next().charAt(0);

            if (resposta == 's' || resposta == 'S') {
                System.out.println("O primeiro interruptor está conectado à lâmpada.");
            } else {
                System.out.println("O terceiro interruptor está conectado à lâmpada.");
            }
        }

        scanner.close();
    }
}
