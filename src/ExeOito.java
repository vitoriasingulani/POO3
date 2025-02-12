import java.util.*;
// 8.Crie um programa que some os números pares de 0 a 10000 e os numeros impares no mesmo intervalo. subtraia a diferença dos números ímpares com a soma dos numeros pares.

public class ExeOito {
    public static void main(String[] args){

        int somaPares = 0;
        int somaImpares = 0;
        for(int i = 0; i <= 10000; i++){
            if(i % 2 == 0){
                somaPares = somaPares + i;
            } else {
                somaImpares = somaImpares + i;
            }
       }
        int resultado = somaPares - somaImpares;
        System.out.println(resultado);

    }
}