package solutions;

public class ArrayStudentScores {
    public static void main(String[] args) {
        int[] scores = new int[4];
        int total = 0;
        float average;

        scores[0] = 97;
        scores[1] = 85;
        scores[2] = 88;
        scores[3] = 91;

        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
            System.out.println("Score " + (i + 1) + " was: "
                    + scores[i]);
        }
        average = total / 4.0f;

        System.out.print("The average of the student's test scores was: ");
        System.out.println(average);
    }
}
