import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = input.nextDouble();
        double F = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em Fahrenheint é " + F + "°");
    }

}
