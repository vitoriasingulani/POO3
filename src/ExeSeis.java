// Faça um programa que peça o nome de N pessoas e imprima o nome de cada uma delas.

import java.util.*;

public class ExeSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas que vc vai cadastrar: ");
        int qntd = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[qntd];

        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Nomes cadastrados:");
        for (int i = 0; i < qntd; i++) {
            System.out.println(nomes[i]);
        }
    }
}