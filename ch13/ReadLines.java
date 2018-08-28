package solutions;

import java.io.*;

public class ReadLines {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Emerson.txt");
            BufferedReader in = new BufferedReader(fr);
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } 
        catch (IOException ioe) {
            System.err.println("Error reading file.");
            System.exit(1);
        }
    }
}
