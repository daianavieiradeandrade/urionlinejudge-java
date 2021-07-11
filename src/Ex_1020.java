import java.util.Scanner;

public class Ex_1020 {
    public static void main(String[] args) {

        int valor, anos, meses, dias;

        Scanner leia = new Scanner(System.in);

        valor = leia.nextInt();


        anos = valor / 365;
        valor = valor % 365;
        meses = valor / 30;
        valor = valor % 30;
        dias = valor;

        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
    }
}
