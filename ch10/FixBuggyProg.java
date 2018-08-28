package solutions;

public class FixBuggyProg {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double base, result;
        int exponent;

        System.out.print("Please enter the number to be used as the base: ");
        base = scanner.nextDouble();

        System.out.print("Please enter the number to be used as the exponent: ");
        exponent = scanner.nextInt();
        scanner.close();

        result = power(base, exponent);
        System.out.println(base + " to the " + exponent + " power is "
                + result);
    }

    public static double power(double base, int exponent) {
        int i;
        double result;

        result = 1;
        for (i = 0; i < exponent; i = i + 1)
            result = result * base;

        return result;
    }
}
