package solutions;

public class IfCelsFahr {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        float fahrenheit = 0.0F;
        float celsius = 0.0F;
        float number = 0.0F;
        String scale = "";

        System.out.print("Please enter your temperature: ");
        number = scanner.nextFloat();

        System.out.print("Please enter the scale: ");
        scale = scanner.next();
        scanner.close();

        if (scale.equals("F") || scale.equals("f")) {
            fahrenheit = number;
            celsius = (fahrenheit - 32) / 1.8F;
        } 
        else if (scale.equals("C") || scale.equals("c")) {
            celsius = number;
            fahrenheit = (celsius * 1.8F) + 32;
        } 
        else {
            System.err.println("Invalid scale specified.  Use 'F' or 'C'.");
            return;
        }

        System.out.print(fahrenheit + " degrees Fahrenheit is ");
        System.out.println(celsius + " degrees Celsius.");
    }
}
