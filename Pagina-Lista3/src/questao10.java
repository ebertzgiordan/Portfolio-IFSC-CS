import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso apresentado na balança (em kg): ");
        double peso = input.nextDouble();
        double preco = (peso - 0.450) * 39;
        System.out.println("O preço dessa refeição é: " + preco);

    }
}
