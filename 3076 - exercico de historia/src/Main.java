import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();

            Double seculo = (double) N / 100;

            System.out.println((int) Math.ceil(seculo));
        }

        sc.close();
    }
}
