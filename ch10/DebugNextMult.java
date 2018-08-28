package solutions;

public class DebugNextMult {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int i = 0;
        int j = 0;

        System.out.println("DEBUG:  Ready to enter the numbers.");

        System.out.print("Enter a number: ");
        i = scanner.nextInt();
        System.out.println("DEBUG:  Entered the number.");

        System.out.print("Enter the multiple value: ");
        j = scanner.nextInt();
        scanner.close();
        System.out.println("DEBUG:  Entered the multiple value.");

        System.out.println("The next even largest multiple of " + i);
        int multiple = nextMultiple(i, j);

        System.out.println(" divided by " + j + " is " + multiple);
    }

    public static int nextMultiple(int num, int mult) {
        int result = num + mult - num % mult;

        System.out.println("DEBUG:  Calculated the multiple.");

        return result;
    }
}
