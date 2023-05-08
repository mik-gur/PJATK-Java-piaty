package zadanie4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KsiazkiTest {
    public static void main(String[] args) {

        KsiazkaPapierowa k1 = new KsiazkaPapierowa("Effective Java", "Joshua Bloch", 416, 2017);
        KsiazkaPapierowa k2 = new KsiazkaPapierowa("Head First Java", "Kathy Sierra, Bert Bates", 720, 2005);
        Ebook k3 = new Ebook("Java Concurrency in Practice", "Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea", 384, 512, "PDF");
        Ebook k4 = new Ebook("Clean Architecture: A Craftsman's Guide to Software Structure and Design", "Robert C. Martin", 432, 1024, "MOBI");
        KsiazkaPapierowa k5 = new KsiazkaPapierowa("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 455, 2018);
        Ebook k6 = new Ebook("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 395, 512, "PDF");

        List<Ksiazka> bookList = new ArrayList<>();
        bookList.add(k1);
        bookList.add(k2);
        bookList.add(k3);
        bookList.add(k4);
        bookList.add(k5);
        bookList.add(k6);

        bookList.stream()
                .sorted(Comparator.comparing(Ksiazka::getTytul))
                .forEach(System.out::println);
    }
}