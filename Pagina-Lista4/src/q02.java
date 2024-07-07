import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        while (num2 < num1 || num1 == num2) {
            System.out.println("O segundo número é menor que o primeiro, digite novamente: ");
            System.out.println("Digite o primeiro número: ");
            num1 = input.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = input.nextInt();

            input.close();
        }
        int soma = num1 + num2;
        System.out.println("A soma dos números são: " + soma);
    }
}
