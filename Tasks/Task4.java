import java.util.Scanner;

class Task4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a palindrome (word/number/char sequence): ");

    StringBuilder word1 = new StringBuilder(sc.next());

    String palindrome = (word1.toString().equals(word1.reverse().toString())) ? 
    "The input string is a palindrome" : 
    "The input string is not palindrome";
    System.out.println(palindrome);

    sc.close();
 }
}