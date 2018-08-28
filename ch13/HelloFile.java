package solutions;

import java.io.*;

public class HelloFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Hello.txt");
            PrintWriter out = new PrintWriter(fw);
            out.println("Hello, world!");
            out.close();
        } 
        catch (IOException ioe) {
            System.err.println("Error writing to file");
            System.exit(1);
        }
    }
}
