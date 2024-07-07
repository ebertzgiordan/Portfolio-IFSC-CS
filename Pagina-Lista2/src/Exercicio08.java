import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá! Digite seu nome para continuar: ");
        String name = input.nextLine();
        System.out.println("Qual sua categoria de trabalho (A -> H): ");
        String cat = input.nextLine();
        cat = cat.toUpperCase();
        System.out.println("Digite o seu salário atual a ser rajustado: ");
        double sal = input.nextDouble();

        if (cat.equals("A") || cat.equals("H")) {
            sal = sal * 0.1 + sal;
            System.out.println("Olá " + name + " você ganhou um aumento de 10% Seu novo salário é de: " + sal);
        }
        if (cat.equals("B") || cat.equals("D") || cat.equals("E")) {
            sal = sal * 0.15 + sal;
            System.out.println("Olá " + name + " você ganhou um aumento de 15% Seu novo salário é de: " + sal);
        }
        if (cat.equals("C") || cat.equals("F")) {
            sal = sal * 0.25 + sal;
            System.out.println("Olá " + name + " você ganhou um aumento de 25% Seu novo salário é de: " + sal);
        } else {
            sal = sal * 0.30 + sal;
            System.out.println("Olá " + name + " você ganhou um aumento de 30% Seu novo salário é de: " + sal);
        }
    }

}
