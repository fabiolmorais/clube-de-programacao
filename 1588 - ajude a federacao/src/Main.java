import java.util.*;

class Time {
    String nome;
    int pontos;
    int vitorias;
    int gols;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.gols = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDeTestes = sc.nextInt();

        for (int T = 0; T < numeroDeTestes; T++) {
            int quantosTimes = sc.nextInt();
            int quantosJogos = sc.nextInt();
            sc.nextLine();

            List<Time> times = new ArrayList<>();
            Map<String, Time> timeMap = new HashMap<>();

            for (int time = 0; time < quantosTimes; time++) {
                String nome = sc.nextLine();
                Time t = new Time(nome);
                times.add(t);
                timeMap.put(nome, t);
            }

            for (int jogos = 0; jogos < quantosJogos; jogos++) {
                int golsTimeA = sc.nextInt();
                String timeA = sc.next();
                int golsTimeB = sc.nextInt();
                String timeB = sc.next();

                Time tA = timeMap.get(timeA);
                Time tB = timeMap.get(timeB);

                tA.gols = tA.gols + golsTimeA;
                tB.gols = tB.gols + golsTimeB;

                if ( golsTimeA > golsTimeB) {
                    tA.pontos += 3;
                    tA.vitorias += 1;
                } else if (golsTimeB > golsTimeA) {
                    tB.pontos += 3;
                    tB.vitorias += 1;
                } else {
                    tA.pontos += 1;
                    tB.pontos += 1;
                }
            }

            times.sort((t1, t2) -> {
                if (t1.pontos != t2.pontos) {
                    return t2.pontos - t1.pontos;
                } else if (t1.vitorias != t2.vitorias) {
                    return t2.vitorias - t1.vitorias;
                } else if (t1.gols != t2.gols) {
                    return t2.gols - t1.gols;
                } else {
                    return 0;
                }
            });

            for (Time time : times) {
                System.out.println(time.nome);
            }
        }

        sc.close();
    }
}
