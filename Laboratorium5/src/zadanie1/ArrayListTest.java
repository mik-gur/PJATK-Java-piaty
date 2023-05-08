package zadanie1;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        ArrayList<Integer> numbers = new ArrayList<>();

        int i = 0;
        int n = 2;
        while (i < 50) {
            numbers.add(n);
            i++;
            n += 2;
        }

        for (int j = 0; j < numbers.size(); j++) {
            System.out.println("Liczba " + numbers.get(j) + " indeks " + j);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Czas operacji: " + duration + " ms");
    }
}
