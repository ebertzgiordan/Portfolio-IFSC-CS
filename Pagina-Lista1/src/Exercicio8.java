import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de consumo");
        System.out.println("Digite a distância(em km):");
        double dist = scanner.nextDouble();
        System.out.println("Digite quantos litros foram gastos:");
        double vol = scanner.nextDouble();
        double consumo = dist / vol;
        System.out.println("Seu consumo foi de " + consumo + "(Km/L)");
    }

}
