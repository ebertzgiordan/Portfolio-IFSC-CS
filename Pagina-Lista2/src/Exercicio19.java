import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Que dia é hoje? ");
        int dia = input.nextInt();

        System.out.println("Qual o mês? ");
        int mes = input.nextInt();

        System.out.println("E qual o ano? ");
        int ano = input.nextInt();

        int[] mes31 = { 1, 3, 5, 7, 8, 10, 12 };
        int[] mes30 = { 4, 6, 9, 11 };

        if (ano >= 0 && ano <= 9999) {
            if (mes >= 1 && mes <= 12) {
                if (isInArray(mes, mes31) && dia >= 1 && dia <= 31) {
                    System.out.println("Data válida");
                } else if (isInArray(mes, mes30) && dia >= 1 && dia <= 30) {
                    System.out.println("Data válida");
                } else if (mes == 2) {
                    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                        if (dia >= 1 && dia <= 29) {
                            System.out.println("Data válida");
                        } else {
                            System.out.println("Data inválida");
                        }
                    } else {
                        if (dia >= 1 && dia <= 28) {
                            System.out.println("Data válida");
                        } else {
                            System.out.println("Data inválida");
                        }
                    }
                } else {
                    System.out.println("Data inválida");
                }
            } else {
                System.out.println("Data inválida");
            }
        } else {
            System.out.println("Data inválida");
        }
    }

    public static boolean isInArray(int value, int[] array) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

}
