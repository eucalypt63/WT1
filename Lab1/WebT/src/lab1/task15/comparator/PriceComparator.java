package lab1.task15.comparator;

import lab1.task15.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
