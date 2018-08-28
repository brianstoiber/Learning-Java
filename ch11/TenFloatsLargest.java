package solutions;

import java.io.*;

public class TenFloatsLargest {
   public static void main(String[] args) {
      float[] floats = new float[10];

      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(ir);
      for (int i=0; i<floats.length; i++) {
         System.out.print("Enter float #" + i + ": ");
         try {
            String input = in.readLine();
            floats[i] = Float.parseFloat(input);
         } catch (IOException ioe) {
            System.err.println("Error accepting input");
            System.exit(1);
         }
      }

      for (int i=0; i<floats.length; i++) {
         System.out.print(floats[i] + " ");
      }

      float largest = -Float.MAX_VALUE;
      int largestPos = -1;

      for (int i=0; i<floats.length; i++) {
         if (largest < floats[i]) {
            largest = floats[i];
            largestPos = i;
         }
      }

      System.out.println("\nThe largest float is " + largest + " at element #" + largestPos);
   }
}
