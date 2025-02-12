// 2. Faça um programa que imprima os números de 10000 até 0.

import java.util.*;

public class ExeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[1001];

        for (int i = 1000; i >= 0; i--) {
            numero[i] = i;
            System.out.println(numero[i]);
        }

    }
}