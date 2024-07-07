import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua altura");
        double altura = input.nextDouble();
        input.nextLine();
        System.out.println("Digite o seu gênero biológico - F (feminino) e M (masculino): ");
        String genero = input.nextLine();
        genero = genero.toUpperCase();

        if (genero.equals("M")) {
            double pesoidealm = 72.7 * altura - 58;
            System.out.printf("O peso ideal para homens é de %.2f kg", pesoidealm);
        } else if (genero.equals("F")) {
            double pesoidealf = 62.1 * altura - 44.7;
            System.out.printf("O peso ideal para mulheres é de %.2f kg", pesoidealf);
        }
    }

}
