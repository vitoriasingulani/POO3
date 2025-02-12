//10. Faça um programa que imprima apenas os números múltiplos de 5 de 10000 até 0.

import java.util.*;

public class ExeDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 10000; i >= 0; i -= 5){ // vai do 1000 para o zero, por isso o <i> começa sendo = 1000
            System.out.println(i);
        }

    }
}