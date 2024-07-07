import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ponto da coordenada x: ");
        double x = input.nextDouble();

        System.out.println("Digite o ponto da coordenada y: ");
        double y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto está no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no terceiro quadrante.");
        } else {
            System.out.println("O ponto está no quarto quadrante.");
        }
    }

}
