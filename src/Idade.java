import java.util.*;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita quantas idades? ");
        int qntdidade = scanner.nextInt();

        int[] idades = new int[qntdidade];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite a idade: ");
            idades[i] = scanner.nextInt();
        }
        System.out.println("Idades: ");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}