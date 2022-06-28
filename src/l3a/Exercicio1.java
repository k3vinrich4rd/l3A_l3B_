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

        if (numero1 > numero2) {
            System.out.print("O primeiro número digitado que foi o " + numero1 + " é maior que o segundo número!");
        } else if (numero2 > numero1) {
            System.out.print("O segundo número digitado que foi o " + numero2 + ", é maior que o primeiro número!");

        } else {
            System.out.println("Os números não podem ser iguais, digite números diferentes!");
        }
    }
}


