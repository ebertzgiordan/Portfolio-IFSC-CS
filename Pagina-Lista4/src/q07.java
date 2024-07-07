import java.util.Scanner;

public class q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Olá! Digite seu nome por genileza: ");
            String name = input.nextLine();

            System.out.println("Tipo do Apto    ||     Valor diária");
            System.out.println("    A           ||          R$150 ");
            System.out.println("    B           ||          R$100 ");
            System.out.println("    C           ||          R$75 ");
            System.out.print("Qual tipo de apartamento deseja?: ");
            String apto = input.nextLine().toUpperCase();
            System.out.print("Digite o número de diárias utilizadas: ");
            int numDiarias = input.nextInt();
            double valorDiaria;
            switch (apto) {
                case "A":
                    valorDiaria = 150.00;
                    break;
                case "B":
                    valorDiaria = 100.00;
                    break;
                case "C":
                    valorDiaria = 75.00;
                    break;
                default:
                    System.out.println("Tipo de apartamento inválido.");
                    return;
            }

            double totalPagar = valorDiaria * numDiarias;

            System.out.println("\nConta final:");
            System.out.println("Nome do hóspede: " + name);
            System.out.println("Tipo do apartamento: " + apto);
            System.out.println("Valor total das diárias: R$" + totalPagar);

            System.out.print("Deseja continuar (S/N)? ");
            continuar = input.next().toUpperCase();
            input.nextLine();

            input.close();

        } while (continuar.equals("S") || continuar.equals("N"));
    }
}
