import java.util.Scanner;

public class Ex_1046 {
    public static void main(String[] args) {

        int horaInicio, horafim, duracao;
        Scanner sc = new Scanner(System.in);

        horaInicio = sc.nextInt();
        horafim = sc.nextInt();

        duracao = (24 - horaInicio + horafim);
        if (duracao > 24){
            duracao = duracao - 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
