package l3a;
// contabilizador de média
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double nota2 = input.nextDouble();
        input.close();

        double mediaDoAluno = (nota1 + nota2) / 2;
        if (mediaDoAluno >= 7 && mediaDoAluno < 10) {
            System.out.println("Aprovado");
        } else if (mediaDoAluno < 7 ) {
            System.out.println("Reprovado");
        } else if (mediaDoAluno == 10) {
            System.out.println("Aprovado com Distinção");
        }
        System.out.println();
        System.out.printf("Média alcançada: %.2f", mediaDoAluno);
    }
}
