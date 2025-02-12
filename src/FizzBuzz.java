//11. Faça um programa que imprima os números de 0 até 10000. Se o número for divisor de 3, mostre "fizz".
// Se o número for divisor de 5, mostre "buzz". Se o número for divisível ao mesmo tempo por 3 e 5, mostre "fizzbuzz".


import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <= 10000; i++){
            if(i % 3 == 0&& i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if(i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0){
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }

    }
}