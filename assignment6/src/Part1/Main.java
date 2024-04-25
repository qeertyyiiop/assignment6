package Part1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryFacade facade = new LibraryFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        System.out.println("1. Проверить наличие книги");
        System.out.println("2. Заимствовать книгу");
        System.out.println("3. Вернуть книгу");
        System.out.println("4. Поиск книги по названию");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода числа

        switch (choice) {
            case 1:
                System.out.println("Введите название книги для проверки наличия:");
                String availabilityCheckTitle = scanner.nextLine();
                if (facade.checkBookAvailability(availabilityCheckTitle)) {
                    System.out.println("Книга '" + availabilityCheckTitle + "' доступна");
                } else {
                    System.out.println("Книга '" + availabilityCheckTitle + "' недоступна");
                }
                break;
            case 2:
                System.out.println("Введите название книги для заимствования:");
                String borrowTitle = scanner.nextLine();
                facade.borrowBook(borrowTitle);
                break;
            case 3:
                System.out.println("Введите название книги для возврата:");
                String returnTitle = scanner.nextLine();
                facade.returnBook(returnTitle);
                break;
            case 4:
                System.out.println("Введите название книги для поиска:");
                String searchTitle = scanner.nextLine();
                List<String> foundBooks = facade.searchBookByTitle(searchTitle);
                if (foundBooks.isEmpty()) {
                    System.out.println("Книги с названием '" + searchTitle + "' не найдены");
                } else {
                    System.out.println("Найденные книги:");
                    for (String book : foundBooks) {
                        System.out.println("- " + book);
                    }
                }
                break;
            default:
                System.out.println("Некорректный выбор");
        }
    }
}
