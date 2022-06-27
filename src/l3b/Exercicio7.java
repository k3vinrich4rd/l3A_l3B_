package l3b;

import java.util.Scanner;

public class Exercicio7 {
    public static boolean primo(int numero) {

        if ((numero == 1) || (numero == 0))
            return (false);
        else {
            int i = 0;
            int fim = 0;
            fim = (int) Math.sqrt(numero);

            for (i = 2; i <= fim; i++) {
                if ((numero % i) == 0)
                    return (false);

            }
            return (true);

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero e sáiba se é um número primo: ");
        int numero = input.nextInt();

        if(primo(numero)){
            System.out.print("O número "+numero+" é primo.");
        }else{
            System.out.print("O número " +numero+ " não é primo.");
        }

    }
}


