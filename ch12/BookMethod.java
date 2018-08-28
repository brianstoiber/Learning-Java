package solutions;

public class BookMethod {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "The Sun Also Rises";
        book.price = 13.95F;
        book.quantity = 8;

        printBook(book);
    }

    public static void printBook(Book book) {
        System.out.print("Book title: " + book.title);
        System.out.print("  price $" + book.price);
        System.out.println("  quantity on hand: " + book.quantity);
    }
}
