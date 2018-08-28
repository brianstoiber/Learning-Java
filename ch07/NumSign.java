package solutions;

public class NumSign {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int data = 0;

        System.out.print("Please enter a number: ");
        data = scanner.nextInt();
        scanner.close();

        if (data >= 0)
            System.out.println(data + " is a positive number.");
        else
            System.out.println(data + " is a negative number.");
    }
}
