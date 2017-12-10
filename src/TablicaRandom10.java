import java.util.Arrays;
import java.util.Random;

public class TablicaRandom10 {
    public static void main(String[] args) {
        System.out.println();

        Random rand = new Random();

        int[] tablica = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica[i] = rand.nextInt(100);
        }
        for (int i : tablica) System.out.print(i + " ");

        int l = tablica.length;
        int zmienna = 0;

        for (int i = 0; i < 5; i++) {
            zmienna = tablica[i];
            tablica[i] = tablica[l - 1- i];
            tablica[l - 1 - i] = zmienna;
        }
        for (int i : tablica) System.out.print(i + " ");
    }
}