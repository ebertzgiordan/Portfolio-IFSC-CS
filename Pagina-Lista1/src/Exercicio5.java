import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        int sucessor = numero++;
        int antecessor = numero - 1;
        System.out.println(
                "Você digitou " + numero + " e seu sucessor é " + sucessor + " e seu antecessor é " + antecessor);
    }
}
