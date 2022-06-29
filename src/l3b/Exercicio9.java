package l3b;
// como calcular o fatorial de um número:
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        input.close();

        int antecessor = numero;
        int resultado = antecessor;

        if (numero < 0)
            System.out.print("Número inválido");
        else {

            while (antecessor > 1) {
                resultado = resultado * (antecessor - 1);
                antecessor--; // até chegar no numero 1

                System.out.println(numero + " x " + antecessor + " = " + resultado);

            }
            System.out.print("O resultado final é: " + resultado);

        }
    }
}