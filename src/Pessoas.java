import java.util.*;

public class Pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] =  scanner.nextLine();
        }
        System.out.println("Nomes: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}