import java.util.*;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[6];

        for (int i = 0; i < pares.length; i++) {
            System.out.println("Digite o numero: ");
            pares[i] = scanner.nextInt();
        }

//        if (pares[0] % 2 == 0) {
//            System.out.println("Esse numero é par");
//        }else if (pares[1] % 2 == 0){
//            System.out.println("Esse numero é par");
//        }else if (pares[2] % 2 == 0){
//            System.out.println("Esse numero é par");
//        }else if (pares[3] % 2 == 0 ){
//            System.out.println("Esse numero é par");
//        }else if (pares[4] % 2 == 0 ){
//            System.out.println("Esse numero é par");
//        }else if (pares[5] % 2 == 0 ){
//            System.out.println("Esse numero é par");
//        }

        System.out.println("pares digitasos:");
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0) {
                System.out.println(pares[i]);
            }
        }
    }
}