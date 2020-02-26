package exercicio01;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {

    private static int[] vetAux = new int[50];
    private static int k;

    public int[] getSequenciaFibonacciDe(int n) {
            k = 1; // inicializa k
            return sequencia(n);
        }

        private static long sequencia(int n) {
            if (n < 0) {
                return vetAux[0];
            } else {
                if (k < 3) {
                    vetAux[n] = k - 1;
                    k++;
                } else {
                    vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
                }
                return sequencia(n - 1);
            }
        }
}
