import java.util.InputMismatchException;
import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeEspectadores = 3;
        int[] idades = new int[quantidadeEspectadores];
        int totalOtimo = 0;
        int totalRuim = 0;
        int somaIdadesRuim = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        for (int i = 0; i < quantidadeEspectadores; i++) {
            int idade = 0;
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Digite a idade do espectador " + (i + 1) + ": ");
                    idade = input.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um número inteiro válido para a idade.");
                    input.next(); 
                }
            }
            idades[i] = idade;
            input.nextLine();

            System.out.println("Nota    ||      Significado");
            System.out.println(" A      ||      Ótimo");
            System.out.println(" B      ||      Bom");
            System.out.println(" C      ||      Regular");
            System.out.println(" D      ||      Ruim");

            System.out.print("Qual a sua avaliação em relação ao filme: ");
            String avaliacao = input.nextLine().toUpperCase();

            if (avaliacao.equals("A")) {
                totalOtimo++;
            } else if (avaliacao.equals("D")) {
                totalRuim++;
                somaIdadesRuim += idades[i];
            }

            maiorIdade = Math.max(maiorIdade, idades[i]);
            menorIdade = Math.min(menorIdade, idades[i]);
        }

        double mediaIdadeRuim = (double) somaIdadesRuim / totalRuim;
        int diferencaIdade = maiorIdade - menorIdade;

        System.out.println("Quantidade de respostas ótimo (A): " + totalOtimo);
        System.out.println("Média de idade das pessoas que responderam ruim (D): " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa de maior e menor idade: " + diferencaIdade);
    }
}
