package l3a;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();
        input.close();

        if (numero1 > numero2){
            System.out.println("O primeiro número digitado, é maior que o segundo número!");
        }
        if (numero2 > numero1){
            System.out.println("O segundo número digitado, é maior que o primeiro número!");
        }
    }
}

