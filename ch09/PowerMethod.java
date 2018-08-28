package solutions;

import java.util.*;

public class PowerMethod {
    public static void main(String[] args) {
        // prepare for reading input
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the base value
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // prompt the user for the exponent value
        System.out.print("\nEnter the exponent: ");
        int exp = scanner.nextInt();

        // call the power method
        double value = power(base, exp);

        // display the result
        System.out.println("The result of " + base + " raised to the "
                + exp + " power is " + value);
        
        scanner.close();
    }

    public static double power(double base, int exp) {
        double result = 1.0;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }
}
