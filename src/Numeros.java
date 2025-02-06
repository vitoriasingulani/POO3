import java.util.*;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new  int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o numero");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Escolha um numero: ");
        int escolha = scanner.nextInt();

        if (numeros[0] == escolha) {
            System.out.println("Esse numero está salvo!");
        } else if (numeros[1] == escolha){
            System.out.println("Esse numero está salvo!");
        }else if (numeros[2] == escolha){
            System.out.println("Esse numero está salvo!");
        }else if (numeros[3] == escolha){
            System.out.println("Esse numero está salvo!");
        }else if (numeros[4] == escolha){
            System.out.println("Esse numero está salvo!");
        }else{
            System.out.println("Esse numero não está salvo");
        }


    }
}

