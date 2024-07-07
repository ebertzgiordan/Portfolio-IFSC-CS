import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int isento = 0;
        int crianca = 0;
        int normal = 0;
        int veio = 0;
        String continuar;

        do {
            System.out.println("Qual é a sua idade: ");
            int idade = input.nextInt();

            if (idade < 6) {
                System.out.println("Isento de cobrança!");
                isento++;
            } else if (idade >= 6 && idade < 12) {
                System.out.println("Bilhete de criança");
                crianca++;
            } else if (idade >= 13 && idade < 65) {
                System.out.println("Bilhete normal");
                normal++;
            } else {
                System.out.println("Bilhete de 3ª idade");
                veio++;
            }

            System.out.print("Deseja continuar (S/N)? ");
            continuar = input.next().toUpperCase();

            input.close();
        } while (continuar.equals("S"));
        System.out.printf("Serão: " + isento + " isentos, " + crianca + " crianças, " + normal + " normais, " + veio
                + " 3° idade.");
    }
}
