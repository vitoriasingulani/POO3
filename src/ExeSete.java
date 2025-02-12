import java.util.*;

//. Faça um programa que some todos os números pares de 0 até 10000.

public class ExeSete {
    public static void main(String[] args) {

        int contador = 0;
        for(int i = 0; i <= 10000; i+= 2){
            contador = i + contador;

        }
        System.out.println(contador);

    }
}