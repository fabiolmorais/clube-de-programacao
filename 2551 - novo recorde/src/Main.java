import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int numertoTreinos = sc.nextInt();
            int[] dias = new int[numertoTreinos];
            int record = 0;

            for (int i = 0; i < numertoTreinos; i++) {
                int tempoEmMinutos = sc.nextInt();
                int distanciaEmKm = sc.nextInt();
                distanciaEmKm *= 1000;


                if ((distanciaEmKm / tempoEmMinutos) > record) {
                    record = distanciaEmKm / tempoEmMinutos;
                    dias[i] = 1;
                }

            }

            for (int i = 0; i < numertoTreinos; i++) {
                if (dias[i] == 1) {
                    System.out.println(i+1);

                }
            }

        }

        sc.close();
    }
}
