import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        double[] precos = { 4.00, 6.00, 6.50, 2.00 };

        System.out.println("Bem vindo à hamburgueria Brutus!");
        System.out.println("Veja o cardápio e faça o seu pedido: ");
        String[] itens = { "Cachorro quente", "X Salada", "Bauru com ovo", "Refrigerante" };

        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 100) + ". - " + itens[i] + "- R$ " + precos[i]);
        }
        System.out.println("Digite o código do lanche que deseja: ");
        int codigo = input.nextInt();
        if (codigo >= 100 || codigo <= 103) {
            System.out.println("Digite a quantidade desejada: ");
            quantidade = input.nextInt();

            input.close();

            double valort = quantidade * precos[codigo - 100];

            System.out.println("Produto selecionado: " + itens[codigo - 100]);
            System.out.println("Preço total: R$" + valort);
            System.out.println("Quantidade: " + quantidade);
        } else {
            System.out.println("Número inválido.");
        }
    }
}
