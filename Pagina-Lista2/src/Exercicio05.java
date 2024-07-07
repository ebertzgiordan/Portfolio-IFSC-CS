import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = input.nextInt();

        if (num <= 10) {
            System.out.println("F1");
        }
        if (num > 10 && num <= 100) {
            System.out.println("F2");
        }
        if (num > 100) {
            System.out.println("F3");
        }
    }

}
