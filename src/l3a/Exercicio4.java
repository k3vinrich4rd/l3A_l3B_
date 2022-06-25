package l3a;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário atual: ");
        double salario = input.nextDouble();
        input.close();

        double vintePorcentoDeAumento = salario * 0.20;
        double quinzePorCentoDeAumento = salario * 0.15;
        double dezPorcentoDeAumento = salario * 0.1;
        double cincoPorcentoDeAumento = salario * 0.05;


        if (salario <= 280) {
            System.out.printf("Salário antes do reajuste: %.2f R$\n", salario);
            System.out.println("O percentual de aumento aplicado foi de: 20%");
            System.out.printf("O valor do aumento foi de: %.2f R$\n", vintePorcentoDeAumento);
            System.out.printf("O seu salário após o aumento é de: %.2f R$\n", salario + vintePorcentoDeAumento);

        } else if (salario > 280 && salario <= 700) {
            System.out.printf("Salário antes do reajuste: %.2f R$\n", salario);
            System.out.println("O pencentual de aumento aplicado foi de: 15%");
            System.out.printf("O valor do aumento foi de: %.2f R$\n", quinzePorCentoDeAumento);
            System.out.printf("O seu salário após o aumento é de: %.2f R$\n", salario + quinzePorCentoDeAumento);

        } else if (salario > 700 && salario <= 1500) {
            System.out.printf("Salário antes do reajuste: %.2f R$\n", salario);
            System.out.println("O percentual de aumento aplicado foi de: 10%");
            System.out.printf("O valor do aumento foi de: %.2f R$\n", dezPorcentoDeAumento);
            System.out.printf("O seu sálario após o aumento foi de: %.2f R$\n", salario + dezPorcentoDeAumento);

        } else if (salario > 1500) {
            System.out.printf("Salário antes do reajuste: %.2f R$\n", salario);
            System.out.println("O porcentual de aumento aplicado foi de: 5%");
            System.out.printf("O valor do aumento foi de: %.2f R$\n",cincoPorcentoDeAumento);
            System.out.printf("O seu salário após o aumento foi de: %.2f R$\n", salario + cincoPorcentoDeAumento);
            
        }
    }
}
