// Faça um programa que imprima os números ímpares de 10000 até 0.

import java.util.*;

public class ExeQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 9999; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}