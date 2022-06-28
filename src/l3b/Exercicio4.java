package l3b;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que você quer efetuar a soma: ");

        int numerosInteiros = input.nextInt();
        int valor = 0;
        int soma = 0;

        for (int i = 0; i < numerosInteiros ; i++) {
            Scanner numeros = new Scanner(System.in);
            System.out.print("Digite um número: ");
            valor = input.nextInt();
            soma += valor; // = soma = soma + valor;
            
        }
        System.out.print("O resultado da soma dos números inteiros e positivo é: "+soma);
    }
}
