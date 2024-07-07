import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número pra tirar a raiz:");
        double x = scanner.nextDouble();
        if (x < 0) {
            System.out.println("Raiz indefinida");
        } else {
            double raiz = Math.sqrt(x);
            System.out.println("A raiz de " + x + " é " + raiz);
        }
    }

}
