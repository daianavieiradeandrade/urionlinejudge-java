import java.util.Scanner;

public class Ex_1036 {
    public static void main(String[] args) {

        double A, B, C, bhaskara;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o A");
        A = sc.nextDouble();
        System.out.println("Informe o B");
        B = sc.nextDouble();
        System.out.println("Informe o C");
        C = sc.nextDouble();

        bhaskara = (B * B) + (-4 * (A * C));

        System.out.println("R1 = " + A);
        System.out.println("R2 = ");

    }
}
