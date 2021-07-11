import java.util.Scanner;

public class Ex_1035 {
    public static void main(String[] args) {

        int A, B, C, D;
        Scanner leia = new Scanner(System.in);

        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        D = leia.nextInt();

        if (B > C && D > A && C + D > A + B & C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
