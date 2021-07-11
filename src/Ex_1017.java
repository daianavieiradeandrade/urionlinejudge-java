import java.util.Scanner;

public class Ex_1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horas, velocidade;
        double litros;

        horas = sc.nextInt();
        velocidade = sc.nextInt();
        litros = (double) (horas * velocidade) / 12;
        System.out.printf("%.3f\n", litros);

    }
}
