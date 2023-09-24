package lab1.task15;

import lab1.task15.comparator.AuthorComparator;
import lab1.task15.comparator.PriceComparator;
import lab1.task15.comparator.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorTitlePriceComparator = new AuthorComparator().thenComparing(new TitleComparator().thenComparing(new PriceComparator()));

        ArrayList<Book> bookArrayList = new ArrayList<>();

        bookArrayList.add(new Book("title4", "author3", 14));
        bookArrayList.add(new Book("title3", "author3", 9));
        bookArrayList.add(new Book("title2", "author2", 4));
        bookArrayList.add(new Book("title2", "author2", 1));
        bookArrayList.add(new Book("title4", "author1", 4));

        ////

        ShellSort.sort(bookArrayList, titleComparator);
        System.out.println(bookArrayList);

        ShellSort.sort(bookArrayList, authorTitleComparator);
        System.out.println(bookArrayList);

        ShellSort.sort(bookArrayList, titleAuthorComparator);
        System.out.println(bookArrayList);

        ShellSort.sort(bookArrayList, authorTitlePriceComparator);
        System.out.println(bookArrayList);
    }
}
