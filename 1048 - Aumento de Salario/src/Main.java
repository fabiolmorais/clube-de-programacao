import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double salario = sc.nextDouble();
        int reajustePercentual = 0;

        if (salario <= 400) {
            System.out.printf("Novo salario: %.2f\n", (salario * 1.15));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.15));
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400 && salario <= 800) {
            System.out.printf("Novo salario: %.2f\n", (salario * 1.12));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.12));
            System.out.println("Em percentual: 12 %");
        } else if (salario > 800 && salario <= 1200) {
            System.out.printf("Novo salario: %.2f\n", (salario * 1.10));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.10));
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200 && salario <= 2000) {
            System.out.printf("Novo salario: %.2f\n", (salario * 1.07));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.07));
            System.out.println("Em percentual: 7 %");
        } else {
            System.out.printf("Novo salario: %.2f\n", (salario * 1.04));
            System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.04));
            System.out.println("Em percentual: 4 %");
        }


        sc.close();
    }
}
