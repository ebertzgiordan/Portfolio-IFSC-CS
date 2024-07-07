import java.util.Scanner;

public class q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cpf;
        double rendaMensal;
        String classe;
        double desconto = 0;

        do {
            System.out.println("Digite seu CPF (ou 00 para sair): ");
            cpf = input.nextLine();

            if (cpf.equals("00")) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.println("Qual a sua renda mensal: ");
            rendaMensal = input.nextDouble();
            input.nextLine();
            System.out.println("Qual a sua classe de renda (A, B, C, D, E): ");
            classe = input.nextLine().toUpperCase();

            desconto = calcularImposto(classe, rendaMensal);

            if (desconto >= 0) {
                System.out.printf("Sua alíquota de desconto aplicada é de %.2f%%, totalizando %.2f.\n", desconto,
                        rendaMensal * (desconto / 100));
            } else {
                System.out.println("Classe inválida!");
            }

            System.out.print("Deseja continuar? Se não, digite o CPF 00: ");
        } while (!cpf.equals("00"));

        input.close();
    }

    public static double calcularImposto(String classe, double rendaMensal) {
        switch (classe) {
            case "A":
                return 0.0;
            case "B":
                return 5.0;
            case "C":
                return 10.0;
            case "D":
                return 15.0;
            case "E":
                return 20.0;
            default:
                return -1;
        }
    }
}
