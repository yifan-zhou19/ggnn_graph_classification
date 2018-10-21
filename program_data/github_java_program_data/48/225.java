package smart.think.puzzles;

public class Palindrome {

    public static void main(String[] args) {

        char[] words = "reliefpfpfeiler".toCharArray();
        System.out.println(isPalindrome(words));

    }

    static boolean isPalindrome(char[] words) {
        int i = 0;
        int j = words.length - 1;

        while (j > i) {

            if (words[i] != words[j]) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
