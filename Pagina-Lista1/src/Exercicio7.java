import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor para X:");
        double x = input.nextDouble();
        double y = 3 * x + 2;
        System.out.println("O valor de y é igual a " + y);
    }

}
