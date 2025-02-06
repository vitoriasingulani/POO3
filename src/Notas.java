import java.util.*;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas durante o ano");
        int qntdNotas = scanner.nextInt();

        double[] notas = new double[qntdNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = notas[i] + soma;
        }

        double media = soma / qntdNotas;
        System.out.println("A média " + media);


    }
}