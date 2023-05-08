package zadanie3;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {

        ArrayList<String> coffeeList = new ArrayList<>();

        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");

        System.out.println("\n"+coffeeList);

        System.out.println("\nIterowanie po liscie:");
        Iterator<String> it = coffeeList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nWypisanie duzymi literami:");
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }

        System.out.println("\nWypisanie pierwszych 4-ech liter:");
        for (String coffee : coffeeList) {
            System.out.println(coffee.substring(0, 4));
        }
    }
}