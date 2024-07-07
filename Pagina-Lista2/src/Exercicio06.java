import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro (1/3)");
        int num1 = input.nextInt();
        System.out.println("Digite um segundo número inteiro (2/3)");
        int num2 = input.nextInt();
        System.out.println("Digite um terceiro número (3/3)");
        int num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.err.println("O número: " + num1 + " é o menor da lista");
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println("O número: " + num2 + " é o menor da lista");
        }
        if (num3 < num1 && num3 < num2) {
            System.out.println("O número: " + num3 + " é o menor da lista");
        }
    }

}
