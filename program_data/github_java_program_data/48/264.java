import java.util.ArrayList;

public class Palindrome {

  public static String possiblePalindrome = "deified";
  public static String possiblePalindrome1 = "racecar";
  public static String possiblePalindrome2 = "izn3ott";

  public static String original;
  public static String reversedString;

  public static String checkIfPalindrome(String string) {

    original = string.toLowerCase();
    reversedString = "";

    for (int i = original.length() - 1; i >= 0; i--) {
      reversedString += original.charAt(i);
    }

    if (original.equals(reversedString)) {
      return string + " is a palindrome";
    } else {
      return string + " is not a palindrome";
    }

  }

  public static void main(String [] args) {
    System.out.println(checkIfPalindrome(possiblePalindrome));
    System.out.println(checkIfPalindrome(possiblePalindrome1));
    System.out.println(checkIfPalindrome(possiblePalindrome2));
  }

}
