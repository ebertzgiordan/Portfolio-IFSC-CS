import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        String nome, sexo;
        int idade, i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite o seu sexo: (M/F)");
        sexo = input.next();

        while (idade != 0) {
            input.nextLine();
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();
            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
            input.nextLine();
            System.out.println("Digite o seu sexo: (M/F)");
            sexo = input.next();
            i++;

            input.close();
        }
        System.out.println("Foram executadas " + i + " vezes.");

    }
}
