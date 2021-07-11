import java.util.Scanner;

public class Ex_1037 {
    public static void main(String[] args) {

        double numero;
        String[] intervalo = {"[0,25]", "(25,50]", "(50,75]", "(75,100]"};
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();

        if(numero >= 0 && (numero <= 25)){
            System.out.println("Intervalo " + intervalo[0]);
        } else if(numero > 25 && (numero <= 50)) {
            System.out.println("Intervalo " + intervalo[1]);
        } else if(numero > 50 && (numero <= 75)) {
            System.out.println("Intervalo " + intervalo[2]);
        } else if(numero > 75 && (numero <= 100)) {
            System.out.println("Intervalo " + intervalo[3]);
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
