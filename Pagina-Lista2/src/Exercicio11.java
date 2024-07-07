import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a hora (0 a 23): ");
        int hora = input.nextInt();
        System.out.println("Digite os minutos (0 e 59): ");
        int min = input.nextInt();
        System.out.println("Digite os segundos (0 a 59): ");
        int seg = input.nextInt();

        seg = hora * 3600 + min * 60 + seg;
        seg++;
        hora = seg / 3600;
        min = (seg % 3600) / 60;
        seg = seg % 60;
        if (hora >= 24) {
            hora -= 24;
        }
        System.out.println("São: " + hora + "h" + min + "m" + seg + "s");
    }

}
