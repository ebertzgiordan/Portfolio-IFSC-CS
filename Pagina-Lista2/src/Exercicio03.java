import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        if (imc > 20) {
            System.out.printf("Seu IMC é :%.2f%n", imc);
            System.out.println("Você está magro");
        } else if (imc < 20 && imc < 24.99) {
            System.out.printf("Seu IMC é :%.2f%n", imc);
            System.out.println("Você está no peso ideal");
        } else if (imc > 30) {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.print("Você está com sobrepeso");
        } else {
            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Voce está  obeso");
        }

    }

}
