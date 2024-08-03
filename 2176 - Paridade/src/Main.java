import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensagem = sc.next();
        int contador = 0;

        for (int i = 0; i < mensagem.length(); i++) {
            if (mensagem.charAt(i) == '1') {
                contador += 1;
            }
        }

        if (contador % 2 == 0) {
            System.out.println(mensagem + '0');
        } else {
            System.out.println(mensagem + '1');
        }


        sc.close();
    }
}
