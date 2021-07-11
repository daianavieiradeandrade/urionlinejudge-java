import java.util.Scanner;

public class Ex_1021 {
    public static void main(String[] args) {

        double valor;
        Scanner leia = new Scanner(System.in);
        valor = leia.nextDouble();

        System.out.println("NOTAS:");
        System.out.println((int) valor / 100 + " nota(s) de R$ 100.00");
        valor = valor % 100;
        System.out.println((int) valor / 50 + " nota(s) de R$ 50.00");
        valor = valor % 50;
        System.out.println((int) valor / 20 + " nota(s) de R$ 20.00");
        valor = valor % 20;
        System.out.println((int) valor / 10 + " nota(s) de R$ 10.00");
        valor = valor % 10;
        System.out.println((int) valor / 5 + " nota(s) de R$ 5.00");
        valor = valor % 5;
        System.out.println((int) valor / 2 + " nota(s) de R$ 2.00\n");
        valor = valor % 2;

        System.out.println("MOEDAS:");
        System.out.println((int) valor / 1 + " moeda(s) de R$ 1.00");
        valor = valor % 1*100;
        System.out.println((int) valor / 50 + " moeda(s) de R$ 0.50");
        valor = valor % 50;
        System.out.println((int) valor / 25 + " moeda(s) de R$ 0.25");
        valor = valor % 25;
        System.out.println((int) valor / 10 + " moeda(s) de R$ 0.10");
        valor = valor % 10;
        System.out.println((int) valor / 5 + " moeda(s) de R$ 0.05");
        valor = valor % 5;
        System.out.println((int) valor / 1 + " moeda(s) de R$ 0.01");

    }
}
