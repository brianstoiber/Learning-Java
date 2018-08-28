package solutions;

import java.util.*;

public class MethodEmployeeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (true) {
            System.out.println("                   Employee File");
            System.out.println("                   -------------");
            System.out.println("         Option  Description");
            System.out.println("         ------  -------------------------");
            System.out.println("            0    Exit");
            System.out.println("            1    Enter a new employee");
            System.out.println("            2    View an existing employee");
            System.out.println("            3    Delete an ex-employee");
            System.out.println("            4    List all employees");
            System.out.println();
            System.out.print("          Please choose an option:");

            option = scanner.nextInt();
            switch (option) {
            case 0:
                scanner.close();
                return;
            case 1:
                enterEmployee();
                break;
            case 2:
                viewEmployee();
                break;
            case 3:
                deleteEmployee();
                break;
            case 4:
                listEmployees();
                break;
            }
        }
    }

    public static void enterEmployee() {
        System.out.print("You entered option number 1");
        System.out.println(" to enter a new employee.");
    }

    public static void viewEmployee() {
        System.out.print("You entered option number 2");
        System.out.println(" to view an existing employee.");
    }

    public static void deleteEmployee() {
        System.out.print("You entered option number 3");
        System.out.println(" to delete an ex-employee.");
    }

    public static void listEmployees() {
        System.out.print("You entered option number 4");
        System.out.println(" to list all employees.");
    }
}
