import java.util.*;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[7];

        for (int i = 0; i < pares.length; i++) {
            System.out.println("Digite o numero: ");
            pares[i] = scanner.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] < 0) {
                contador = contador + 1;
            }
        }

        System.out.println("o total de numeros negativos foi de: " + contador);
    }
}