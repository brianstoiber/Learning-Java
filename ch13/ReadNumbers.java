package solutions;

import java.io.*;

public class ReadNumbers {
    public static void main(String[] args) {
        float[] numbers = new float[9];
        try {
            FileReader fr = new FileReader("planetmass.txt");
            BufferedReader in = new BufferedReader(fr);
            String line;
            for (int i = 0; i < numbers.length; i++) {
                line = in.readLine();
                float f = Float.parseFloat(line);
                numbers[i] = f;
            }
            in.close();
        } 
        catch (IOException ioe) {
            System.err.println("Error reading file.");
            System.exit(1);
        }
        float total = 0.0F;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        System.out.println("The average of the numbers is: "
                + (total / numbers.length));
    }
}
