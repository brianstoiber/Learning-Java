package solutions;

import java.io.*;

public class TenFloats {
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
   }
}
