package lessons1;

import lessons1.dao.BookDAO;

import java.util.Scanner;

public class MainRuner {



    private final static String ADD_BOOK = "добавить книгу";
    private final static String DEL_BOOK  = "удалить книгу";
    private final static String ARRAY_BOOKS  = "список книг";
    private final static String UPDATE_BOOK  = "изменить книгу";

    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Привет, я программа библиотеки" +
                     "\n --- Чтобы добавить книгу введи 'добавить книгу'" +
                     "\n --- Чтобы добавить книгу введи 'удалить книгу'" +
                     "\n --- Чтобы добавить книгу введи 'посотреть список книг'" +
                     "\n --- Чтобы добавить книгу введи 'изменить книгу'");

            String command = scanner.nextLine();
            switch (command) {
                case ADD_BOOK:
                    System.out.println("введите название книги");
                    String name = scanner.nextLine();
                    bookDAO.addBook(name);

                    break;
                case DEL_BOOK:
                    break;
                case ARRAY_BOOKS:
                    bookDAO.showBooks();
                    break;
                case UPDATE_BOOK:
                    System.out.println("введите какую книгу заменить");
                    String nameBook = scanner.nextLine();
                    System.out.println("введите на какую книгу заменить");
                    String nameBookNew = scanner.nextLine();
                    bookDAO.newBook(nameBook, nameBookNew);
                    break;
                default:
                    System.out.println("я тебя не понял ");

            }
        }



    }
}
