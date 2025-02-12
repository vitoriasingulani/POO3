//3. Faça um programa que imprima os números pares de 0 até 10000.

import java.util.*;

public class ExeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[10001];

        for (int i = 0; i <= 10000; i += 2) {
            System.out.println(i);
        }
    }
}