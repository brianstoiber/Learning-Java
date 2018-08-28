package solutions;

import java.util.*;

public class PointDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;

        System.out.print("Enter the x coordinate of the first point: ");
        x1 = scanner.nextDouble();

        System.out.print("Enter the y coordinate of the first point: ");
        y1 = scanner.nextDouble();

        System.out.print("Enter the x coordinate of the second point: ");
        x2 = scanner.nextDouble();

        System.out.print("Enter the y coordinate of the second point: ");
        y2 = scanner.nextDouble();

        System.out.print("The distance from (" + x1 + ", " + y1
                + ") to (" + x2 + ", " + y2 + ")");
        double distance = distance(x1, y1, x2, y2);
        System.out.println(" is " + distance);
        
        scanner.close();
    }

    public static double distance(double x1, double y1, double x2,
            double y2) {
        double result = Math.sqrt(power(x1 - x2, 2)
                + power(y1 - y2, 2));
        return result;
    }

    public static double power(double base, int exp) {
        double result = 1.0;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }
}
