import java.util.Scanner;

public class Exercicio15 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        int idade = input.nextInt();
        if (idade >= 5 && idade <= 10) {
            System.out.println("O nadador é infantil.");
        } else if (idade >= 11 && idade <= 17) {
            System.out.println("O nadador é juvenil.");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("O nadador é adulto.");
        } else {
            System.out.println("O nadador é sênior.");
        }
    }

}
