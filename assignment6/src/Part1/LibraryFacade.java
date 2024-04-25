package Part1;

import java.util.List;

class LibraryFacade {
    private InventorySubsystem inventory;
    private UserSubsystem user;

    public LibraryFacade() {
        this.inventory = new InventorySubsystem();
        this.user = new UserSubsystem();
    }

    public boolean checkBookAvailability(String bookTitle) {
        return inventory.checkAvailability(bookTitle);
    }

    public void borrowBook(String bookTitle) {
        if (checkBookAvailability(bookTitle)) {
            user.borrowBook(bookTitle);
        } else {
            System.out.println("Книга '" + bookTitle + "' недоступна в настоящее время");
        }
    }

    public void returnBook(String bookTitle) {
        user.returnBook(bookTitle);
    }

    // Метод для поиска книги по названию
    public List<String> searchBookByTitle(String title) {
        return inventory.searchByTitle(title);
    }
}
