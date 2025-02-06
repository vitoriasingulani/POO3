import java.util.*;

public class Invertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("A ordem interdida dos numeros são: " + numeros[4] + "," + numeros[3]+ ","  + numeros[2]+ ","  + numeros[1]+ ","  + numeros[0]);
    }
}