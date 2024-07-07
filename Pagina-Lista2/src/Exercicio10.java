import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamando do lado 1 do triângulo: ");
        int l1 = input.nextInt();
        System.out.println("Digite o tamanho do lado 2 do triângulo: ");
        int l2 = input.nextInt();
        System.out.println("Digite o tamanho do lado 3 do triângulo: ");
        int l3 = input.nextInt();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            if (l1 == l2 && l1 == l3) {
                System.out.println("O triângulo é equilátero!");
            } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                System.out.println("O triângulo é isósceles!");
            } else {
                System.out.println("O triângulo é escaleno");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }
    }

}
