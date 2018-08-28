package solutions;

public class CharClass {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        char data = ' ';

        System.out.print("Please enter a single character: ");
        String s = scanner.next();
        data = s.charAt(0);
        scanner.close();

        if (data >= '0' && data <= '9') {
            System.out.println(data + " is a digit.");
        } 
        else if (data == 'a' || data == 'A' || data == 'e'
                || data == 'E' || data == 'i' || data == 'I'
                || data == 'o' || data == 'O' || data == 'u'
                || data == 'U') {
            System.out.println(data + " is a vowel.");
        } 
        else if ((data >= 'A' && data <= 'Z')
                || (data >= 'a' && data <= 'z')) {
            System.out.println(data + " is a consonant.");
        } 
        else {
            System.out.println(data + " is a special character.");
        }
    }
}
