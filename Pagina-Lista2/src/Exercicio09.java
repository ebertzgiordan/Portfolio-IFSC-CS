import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da sua conta: ");
        String conta = input.nextLine();
        System.out.println("Digite o saldo atual: ");
        double atual = input.nextDouble();
        System.out.println("Digite a operação a ser realizada (1 - depósito ou 2 - saque)");
        int opcao = input.nextInt();
        System.out.println("Digite o valor a ser manuseado: ");
        double valor = input.nextDouble();
        if (opcao == 1) {
            atual = atual + valor;
            System.out.println("Saldo atualizado com sucesso: R$" + atual);
        }
        if (opcao == 2) {
            atual = atual - valor;
            System.out.println("Saldo atualizado com sucesso: R$" + atual);
            if (atual < 0) {
                System.out.println("Conta estourada!!");
            }
        }
    }

}
