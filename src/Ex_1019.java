import java.util.Scanner;

public class Ex_1019 {
    public static void main(String[] args) {

        int tempo, horas, minutos, segundos, resto;
        Scanner input = new Scanner(System.in);

        tempo = input.nextInt();

        horas = tempo / 3600;
        tempo = tempo % 3600;

        minutos = tempo / 60;
        tempo = tempo % 60;

        segundos = tempo;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
