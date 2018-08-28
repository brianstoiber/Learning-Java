package solutions;

public class TrigTable {
    public static void main(String[] args) {
        for (double radians = 0.0; radians < 3.6; radians = radians + 0.1) {
            printTrig(radians);
        }
    }

    public static void printTrig(double rad) {
        System.out.println("The sine of " + rad + " is "
                + Math.sin(rad));
        System.out.println("The cosine of " + rad + " is "
                + Math.cos(rad));
        System.out.println("The tangent of " + rad + " is "
                + Math.tan(rad));
    }
}
