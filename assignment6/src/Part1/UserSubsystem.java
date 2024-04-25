package Part1;

class UserSubsystem {
    public void borrowBook(String bookTitle) {
        System.out.println("Книга '" + bookTitle + "' заимствована");
    }

    public void returnBook(String bookTitle) {
        System.out.println("Книга '" + bookTitle + "' возвращена");
    }
}