import java.util.Scanner;

public class questao13 {
    public static void main(String args[]) {
        double peso, engordar, emagrecer;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual e o seu peso:");
        peso = input.nextInt();
        engordar = peso * 0.15 + peso;
        emagrecer = peso * 0.2 - peso;
        emagrecer = emagrecer * -1;
        System.out.println("Seu peso sera: " + engordar + "kg se voce engordar 15%");
        System.out.println("Seu peso sera: " + emagrecer + "kg se voce emagrecer 20%");

    }
}
