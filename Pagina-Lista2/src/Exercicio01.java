import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de consumo");
        System.out.println("Insira o valor de KwH consumida: ");
        double kw = input.nextDouble();
        System.out.println("Digite o preço do KwH: ");
        double preco = input.nextDouble();
        double total = kw * preco;
        double juro = total * 0.1 + total;
        System.out.println("O preco a ser pago e: R$" + total + ", mas se tiver juro sera: R$" + juro);
        if (kw > 70) {
            System.out.println("Consumo elevado de energia");
        } else {
            System.out.println("Você é um consumidor consciente");
        }

    }

}
