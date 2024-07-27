import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int LA = sc.nextInt();
        int LB = sc.nextInt();
        int SA = sc.nextInt();
        int SB = sc.nextInt();

        String resultado = "possivel";

        if (N < LA || N > LB || N < SA || N > SB) {
            resultado = "impossivel";
        }

        System.out.println(resultado);

        sc.close();
    }
}
