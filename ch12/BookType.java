package solutions;

public class BookType {
    public static void main(String[] args) {
        Book2 book = new Book2();
        book.title = "The Sun Also Rises";
        book.price = 13.95F;
        book.quantity = 8;
        book.hardback = false;

        printBook(book);
    }

    public static void printBook(Book2 book) {
        if (book.hardback) {
            System.out.print("Hard: ");
        } 
        else {
            System.out.print("Paper: ");
        }
        System.out.print("title: " + book.title);
        System.out.print("  price $" + book.price);
        System.out.println("  quantity on hand: " + book.quantity);
    }
}
