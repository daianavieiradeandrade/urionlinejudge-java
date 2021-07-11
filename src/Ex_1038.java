import java.util.Scanner;

public class Ex_1038 {
    public static void main(String[] args) {

        int codigo, quantidade;
        double valor;
        Scanner sc = new Scanner(System.in);

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo){
            case 1:
                valor = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 2:
                valor = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 3:
                valor = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 4:
                valor = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
            case 5:
                valor = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f\n", valor);
                break;
        }
    }
}
