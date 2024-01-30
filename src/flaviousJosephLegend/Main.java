package flaviousJosephLegend;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for(int i = 0; i < cases; i++){

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            LinkedList<Integer> listaAux = new LinkedList<>();

            for (int aux = 1; aux <= n; aux++) {
                    listaAux.add(aux);
            }

            int remover = 0;

            while (listaAux.size() > 1) {
                    remover = (remover + k - 1) % listaAux.size();
                    listaAux.remove(remover);
            }

            System.out.printf("Case %d: %d\n", i,listaAux.get(0));

        }
    }
}