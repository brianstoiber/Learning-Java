package solutions;

import java.util.*;

public class MethodTempConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float fahrenheit = 0.0F;
        float celsius = 0.0F;
        float number = 0.0F;
        String scale = "";

        System.out.print("Please enter your temperature: ");
        number = scanner.nextFloat();

        System.out.print("Please enter the scale: ");
        scale = scanner.next();
        scanner.close();

        if (scale.charAt(0) == 'F' || scale.charAt(0) == 'f') {
            fahrenheit = number;
            celsius = fahrenheitToCelsius(fahrenheit);
        } 
        else if (scale.charAt(0) == 'C' || scale.charAt(0) == 'c') {
            celsius = number;
            fahrenheit = celsiusToFahrenheit(celsius);
        } 
        else {
            System.err.println("Invalid scale specified.  Use 'F' or 'C'.");
            return;
        }

        System.out.print(fahrenheit + " degrees fahrenheit is ");
        System.out.println(celsius + " degrees celsius.");
    }

    public static float fahrenheitToCelsius(float fahrTemp) {
        float celsius = (fahrTemp - 32) / 1.8F;
        return celsius;
    }

    public static float celsiusToFahrenheit(float celcTemp) {
        float fahrenheit = (celcTemp * 1.8F) + 32;
        return fahrenheit;
    }
}
