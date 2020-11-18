import java.util.Scanner;


public class CountCharacters {

  public static void main(String[] args) {
    System.out.println("Please enter some text and the program will count the number of a's.");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();



    int charCount = 0;

    for (char ch: input.toCharArray()) {
      if (ch == 'a') {
        charCount++;
      }
    }
    System.out.println("In [ " + input + "] there are " + charCount + " a's.");
  }
}
