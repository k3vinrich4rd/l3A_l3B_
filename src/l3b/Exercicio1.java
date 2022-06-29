package l3b;
// contador numeral (de 1 a 100)
public class Exercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);
        }
        int contador = 1;
        while (contador <= 100) {
            System.out.println(contador++);
        }
    }
}
