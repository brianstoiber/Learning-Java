package solutions;

public class BookStore {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Book2[] books = new Book2[5];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter the book title: ");
            String title = scanner.next();

            System.out.print("Enter the book price $");
            float price = scanner.nextFloat();

            System.out.print("Enter the quantity on hand: ");
            int quantity = scanner.nextInt();

            System.out
                    .print("Enter 'H' for hardcover or 'P' for paperback: ");
            String type = scanner.next();
           
            boolean hard = false;
            if (type.charAt(0) == 'H' || type.charAt(0) == 'h')
                hard = true;

            Book2 book = new Book2();

            book.title = title;
            book.price = price;
            book.quantity = quantity;
            book.hardback = hard;

            books[i] = book;

        }
        scanner.close();

        printInventory(books);
    }

    public static void printInventory(Book2[] books) {
        for (int i = 0; i < books.length; i++) {
            printBook(books[i]);
        }
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
