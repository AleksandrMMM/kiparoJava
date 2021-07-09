package lessons1.dao;

import lessons1.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    Book book;
    private List<Book> books = new ArrayList<>();

    public void addBook(String name) {
        book = new Book(name);
        books.add(book);
    }

    public void addBook(String name, int id) {
        book = new Book(name, id);
        books.add(book);
    }

    public boolean delBook(String name) {
        for (Book books1: books) {
            if (books1.getName().equals(name)) {
                books.remove(books1);
                return true;
            }else {
                return false;
            }

        }
        return false;
    }

    public void showBooks() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public void newBook(String name, String newName) {
        for (Book book: books) {
            if (book.getName().equals(name)) {
                int id = book.getId();
                delBook(name);
                addBook(newName, id);

            }
        }
    }

}
