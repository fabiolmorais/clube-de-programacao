import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDeCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numeroDeCasos; i++) {
            String msgCodificada = sc.nextLine();
            StringBuilder texto = new StringBuilder();

            for (char c : msgCodificada.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    texto.append(c);
                }
            }

            String textoDecodificado = texto.reverse().toString();
            System.out.println(textoDecodificado);

        }

        sc.close();
    }
}
