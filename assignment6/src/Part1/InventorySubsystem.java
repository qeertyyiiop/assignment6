package Part1;

import java.util.ArrayList;
import java.util.List;

class InventorySubsystem {
    public boolean checkAvailability(String bookTitle) {
        return true;
    }

    public List<String> searchByTitle(String title) {
        List<String> books = new ArrayList<>();
        books.add("Война и мир");
        books.add("Преступление и наказание");
        books.add("Мастер и Маргарита");
        return books;
    }
}
