import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeAlunos = 10;
        double[] alturas = new double[quantidadeAlunos];
        double somaAlturas = 0.0;
        double maiorAltura = 0.0;
        int contadorMulheres = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite o código do sexo (1 para masculino, 2 para feminino): ");
            int codigoSexo = input.nextInt();

            if (codigoSexo == 2) {
                contadorMulheres++;
            }
            System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros): ");
            alturas[i] = input.nextDouble();
            somaAlturas += alturas[i];

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }

        input.close();

        double mediaAlturas = somaAlturas / quantidadeAlunos;
        double mediaAlturasMulheres = somaAlturasMulheres(alturas, contadorMulheres);

        System.out.println("Maior altura da turma: " + maiorAltura + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturasMulheres + " metros");
        System.out.println("Média de altura da turma geral: " + mediaAlturas + " metros");
    }

    public static double somaAlturasMulheres(double[] alturas, int contadorMulheres) {
        double somaAlturasMulheres = 0.0;

        for (double altura : alturas) {
            somaAlturasMulheres += altura;
        }

        return somaAlturasMulheres / contadorMulheres;
    }
}
