import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = 4;

        for (int t = 0; t < N; t++) {

            int M = sc.nextInt();
            Integer[][] valores = new Integer[M][M];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    int valor = sc.nextInt();
                    valores[i][j] = valor * valor;
                }
            }

            int[] larguraMaximaColuna = new int[M];
            for (int j = 0; j < M; j++) {
                int larguraMaxima = 0;
                for (int i = 0; i < M; i++) {
                    int largura = Integer.toString(valores[i][j]).length();
                    if (largura > larguraMaxima) {
                        larguraMaxima = largura;
                    }
                }
                larguraMaximaColuna[j] = larguraMaxima;
            }

            System.out.println("Quadrado da matriz #" + x + ":");

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.printf("%" + larguraMaximaColuna[j] + "d", valores[i][j]);
                    if (j < M - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            if (t < N - 1) {
                System.out.println();
            }

        }
        sc.close();
    }
}
