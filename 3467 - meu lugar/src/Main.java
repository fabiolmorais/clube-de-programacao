import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String lugar = sc.next();
            String resultado = "Oi, Leonard";

            if (lugar.charAt(2) == 'L') {
                resultado = "Esse eh o meu lugar";
            }


            System.out.println(resultado);
        }


        sc.close();
    }
}
