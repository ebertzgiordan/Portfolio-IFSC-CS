import java.util.Scanner;

public class ex06 {
    public static void main(String args[]) {
        double num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de potencia 2:");
        num2 = input.nextInt();
        System.out.println("O resultado e: " + num2 * num2);
    }
}
