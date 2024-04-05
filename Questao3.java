public class ProximosElementos {
    public static void main(String[] args) {
        // Sequência a)
        int proximoElementoA;
        int ultimoElementoA = 7;

        if (ultimoElementoA == 7) {
            proximoElementoA = ultimoElementoA + 2;
        } else {
            proximoElementoA = 0; // Valor padrão caso não corresponda ao padrão
        }
        System.out.println("Próximo elemento da sequência a): " + proximoElementoA);

        // Sequência b)
        int proximoElementoB;
        int ultimoElementoB = 64;

        if (ultimoElementoB == 64) {
            proximoElementoB = ultimoElementoB * 2;
        } else {
            proximoElementoB = 0; // Valor padrão caso não corresponda ao padrão
        }
        System.out.println("Próximo elemento da sequência b): " + proximoElementoB);

        // Sequência c)
        int proximoElementoC;
        int ultimoElementoC = 36;

        if (ultimoElementoC == 36) {
            proximoElementoC = (int) Math.pow(Math.sqrt(ultimoElementoC) + 1, 2);
        } else {
            proximoElementoC = 0; // Valor padrão caso não corresponda ao padrão
        }
        System.out.println("Próximo elemento da sequência c): " + proximoElementoC);

        // Sequência d)
        int proximoElementoD;
        int ultimoElementoD = 64;

        if (ultimoElementoD == 64) {
            proximoElementoD = ultimoElementoD + 36;
        } else {
            proximoElementoD = 0; // Valor padrão caso não corresponda ao padrão
        }
        System.out.println("Próximo elemento da sequência d): " + proximoElementoD);

        // Sequência e)
        int proximoElementoE;
        int penultimoElementoE = 8;
        int ultimoElementoE = 5;

        if (ultimoElementoE == 5) {
            proximoElementoE = penultimoElementoE + ultimoElementoE;
        } else {
            proximoElementoE = 0; // Valor padrão caso não corresponda ao padrão
        }
        System.out.println("Próximo elemento da sequência e): " + proximoElementoE);

        // Sequência f)
        int proximoElementoF;
        int ultimoElementoF = 19;

        if (ultimoElementoF == 19) {
            proximoElementoF = ultimoElementoF + 1;
        } else {
            proximoElementoF = 0; // Valor padrão caso não corresponda ao padrão
        }
        System.out.println("Próximo elemento da sequência f): " + proximoElementoF);
    }
}
