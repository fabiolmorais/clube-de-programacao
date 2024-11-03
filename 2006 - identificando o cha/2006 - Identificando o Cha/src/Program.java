import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do tipo do chá:");
        int typeOfTea = sc.nextInt();
        int count = 0;
        int[] answers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor da resposta:");
            answers[i] = sc.nextInt();
            if (answers[i] == typeOfTea) {
                count++;
            }
        }

        System.out.println(count);



        sc.close();
    }
}
