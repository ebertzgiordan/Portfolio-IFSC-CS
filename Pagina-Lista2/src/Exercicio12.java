import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ângulo para classificação: ");
        int ang = input.nextInt();
        if (ang < 90) {
            System.out.println("O ângulo é agudo.");
        } else if (ang == 90) {
            System.out.println("O ângulo é reto.");
        } else {
            System.out.println("O ângulo é obtuso.");
        }
    }

}
