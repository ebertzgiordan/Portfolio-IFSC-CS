import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String produto1 = input.nextLine();
        System.out.println("Digite a quantidade em estoque desse produto: ");
        int quant1 = input.nextInt();
        input.nextLine();

        System.out.println("Digite o nome do produto: ");
        String produto2 = input.nextLine();
        System.out.println("Digite a quantidade em estoque desse produto: ");
        int quant2 = input.nextInt();
        input.nextLine();

        System.out.println("Digite o nome do produto: ");
        String produto3 = input.nextLine();
        System.out.println("Digite a quantidade em estoque desse produto: ");
        int quant3 = input.nextInt();
        input.nextLine();

        if (quant1 <= 30) {
            System.out.println("O produto: " + produto1 + " está abaixo do mínimo no estoque (30), está com " + quant1);
        }
        if (quant2 <= 30) {
            System.out.println("O produto: " + produto2 + " está abaixo do mínimo no estoque (30), está com " + quant2);
        }
        if (quant3 <= 30) {
            System.out.println("O produto: " + produto3 + " está abaixo do mínimo no estoque (30), está com " + quant3);
        }
    }

}
