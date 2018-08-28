package solutions;

import java.util.*;

public class MethodNextMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int j = 0;

        System.out.print("Enter a number: ");
        i = scanner.nextInt();

        System.out.print("Enter the multiple value: ");
        j = scanner.nextInt();

        System.out.println("The next even largest multiple of " + i);
        int multiple = nextMultiple(i, j);
        System.out.println(" divided by " + j + " is " + multiple);
        
        scanner.close();
    }

    public static int nextMultiple(int num, int mult) {
        int result = num + mult - num % mult;
        return result;
    }
}
