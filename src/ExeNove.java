// 9. Faça um programa que receba N itens de compra e imprima o nome de cada item da lista.
import java.util.*;

public class ExeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens: ");
        int qntd = scanner.nextInt();
        scanner.nextLine();

        String[] itens = new String[qntd];

        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o nome do item " + (i + 1) + ": ");
            itens[i] = scanner.nextLine();
        }

        System.out.println("Itens da lista:");
        for (String item : itens){
            System.out.println(item);
        }
    }
}
