import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um peso da gravidade da terra (10ms):");
        double peso = input.nextDouble();
        System.out.println("Escolha um planeta para se calcular o peso com a sua gravidade:");
        System.out.printf("1. Mercúrio%n2. Vênus%n3. Marte%n4. Júpiter%n5. Saturno%n6. Urano%n7. Netuno%n");
        int escolha = input.nextInt();

        switch (escolha) {
            case 1: // Mercúrio
                peso *= 0.38;
                break;
            case 2: // Vênus
                peso *= 0.91;
                break;
            case 3: // Marte
                peso *= 0.38;
                break;
            case 4: // Júpiter
                peso *= 2.34;
                break;
            case 5: // Saturno
                peso *= 1.06;
                break;
            case 6: // Urano
                peso *= 0.92;
                break;
            case 7: // Netuno
                peso *= 1.19;
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
        if (escolha >= 1 && escolha <= 7) {
            System.out.printf("O novo peso no planeta escolhido é: %.2f%n", peso);
        }
    }

}
