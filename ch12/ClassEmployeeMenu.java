package solutions;

public class ClassEmployeeMenu {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Employee[] employees = new Employee[100];
        int count = 0;

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
                count = enterEmployee(employees, count, scanner);
                break;
            case 2:
                viewEmployee(employees, count, scanner);
                break;
            case 3:
                deleteEmployee(employees, count, scanner);
                break;
            case 4:
                listEmployees(employees, count);
                break;
            }
        }
    }

    public static int enterEmployee(Employee[] ees, int pos,
            java.util.Scanner scanner) {
        System.out.print("Enter the employee's first name: ");
        String fName = scanner.next();

        System.out.print("Enter the employee's last name: ");
        String lName = scanner.next();

        System.out.print("Enter the employee's phone number: ");
        String phone = scanner.next();

        System.out.print("Enter the employee's department code: ");
        String deptCode = scanner.next();

        System.out.print("Enter the employee's salary: ");
        float salary = scanner.nextFloat();

        Employee ee = new Employee();
        ee.firstName = fName;
        ee.lastName = lName;
        ee.phone = phone;
        ee.deptCode = deptCode;
        ee.salary = salary;

        ees[pos] = ee;
        System.out.println("Employee " + fName + " " + lName
                + " added.");

        return pos + 1;
    }

    public static void viewEmployee(Employee[] ees, int count,
            java.util.Scanner scanner) {

        System.out.print("Enter the last name of the employee you want to view: ");
        String lName = scanner.next();

        for (int i = 0; i < count; i++) {
            if (ees[i].lastName.equals(lName)) {
                System.out.print(ees[i].firstName + " " + ees[i].lastName);
                System.out.print(" phone #" + ees[i].phone + " department: " + ees[i].deptCode);
                System.out.println(" salary $" + ees[i].salary);
            }
        }
    }

    public static void deleteEmployee(Employee[] ees, int count,
            java.util.Scanner scanner) {

        System.out.print("Enter the first name of the employee you want to delete: ");
        String fName = scanner.next();

        System.out.print("Enter the last name of the employee you want to delete: ");
        String lName = scanner.next();

        for (int i = 0; i < count; i++) {
            if (ees[i].firstName.equals(fName)
                    && ees[i].lastName.equals(lName)) {
                ees[i].deptCode = null;
                System.out.println("Deleted: " + ees[i].firstName
                        + " " + ees[i].lastName);
            }
        }
    }

    public static void listEmployees(Employee[] ees, int count) {
        for (int i = 0; i < count; i++) {
            if (ees[i].deptCode != null) {
                System.out.print(ees[i].firstName + " " + ees[i].lastName);
                System.out.print(" phone #" + ees[i].phone + " department: " + ees[i].deptCode);
                System.out.println(" salary $" + ees[i].salary);
            }
        }
    }
}
