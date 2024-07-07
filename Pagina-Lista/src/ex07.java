import java.util.Scanner;

public class ex07 {
    public static void main(String args[]) {
        double num1, num2, num3, num4, soma;

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de potencia 2:");
        System.out.println("Digite o primeiro valor:");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo valor:");
        num2 = input.nextDouble();
        System.out.println("Digite o terceiro valor:");
        num3 = input.nextDouble();
        System.out.println("Digite o quarto valor:");
        num4 = input.nextDouble();

        num1 = Math.pow(num1, 2);
        num2 = Math.pow(num2, 2);
        num3 = Math.pow(num3, 2);
        num4 = Math.pow(num4, 2);

        System.out.println("Os resultados sao: " + num1 + "/ " + num2 + "/ " + num3 + "/ " + num4);
        soma = num1 + num2 + num3 + num4;
        System.out.println("A soma total dos quadrados e: " + soma);
    }
}
