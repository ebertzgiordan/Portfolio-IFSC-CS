import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu saldo médio no banco: ");
        double medio = input.nextDouble();
        if (medio > 3000) {
            System.out.println("O seu crédito especial será de 50% sobre seu saldo médio anterior: " + (medio * 1.5));
        } else if (medio > 1000 && medio <= 3000) {
            System.out.println("O seu crédito especial será de 40% sobre seu saldo médio anterior: " + (medio * 1.4));
        } else if (medio > 500 && medio <= 1000) {
            System.out.println("O seu crédito especial será de 30% sobre seu saldo médio anterior: " + (medio * 1.3));
        } else {
            System.out.println("Desculpe mas nessa média não há nenhum crédito especial: " + medio);
        }

    }

}
