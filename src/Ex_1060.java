import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList positivos = new ArrayList<>();
        double num;

        for (int i = 0; i < 6; i++) {
        num = sc.nextDouble();
            if(num > 0){
                positivos.add(num);
            }
        }
        System.out.println(positivos.size() + " valores positivos");
    }
}
