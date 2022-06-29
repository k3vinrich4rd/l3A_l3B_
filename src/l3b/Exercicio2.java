package l3b;
// contabilizador de média
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que você quer verificar a média: ");
        int numeros = input.nextInt();
        double valor = 0;
        double soma = 0;
        double media = 0;

        for (int c = 0; c < numeros; c++) {

            Scanner num = new Scanner(System.in);
            System.out.print("Digite um número: ");
            valor = input.nextDouble();
            soma += valor;
        }
        media = soma / numeros;
        System.out.println("A média é " + media);
    }
}
