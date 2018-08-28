package solutions;

public class CharClassSwitch {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);

      char data = ' ';

      System.out.print("Please enter a single character: ");
      String s = scanner.next();
      data = s.charAt(0);
      scanner.close();
    
      switch (data) {
          case '0': case '1': case '2': case '3': case '4':
          case '5': case '6': case '7': case '8': case '9':
              System.out.println(data + " is a digit.");
          break;
          case 'a': case 'A': case 'e': case 'E': case 'i':
          case 'I': case 'o': case 'O': case 'u': case 'U':
              System.out.println(data + " is a vowel.");
              break;
          default:
              System.out.println(data + " is neither a vowel nor a digit.");
      }
    }
}
