import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número inteiro (" + (i + 1) + "/3):");
            numeros[i] = input.nextInt();
        }
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }

}
