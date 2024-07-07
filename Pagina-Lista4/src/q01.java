import java.util.Scanner;

public class q01 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();

        while (num1 != num2) {
            System.out.println("Os números não são iguais. Vamos tentar novamente.");
            System.out.println("Digite o primeiro número: ");
            num1 = input.nextDouble();

            System.out.println("Digite o segundo número: ");
            num2 = input.nextDouble();
        }

        input.close();

        System.out.println("Os dois números são iguais!");
    }
}
