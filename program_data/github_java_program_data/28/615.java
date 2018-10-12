/**
 * Created by julantino on 2016/10/20.
 */


class Palindrome {
    public static boolean isPalindrome(String word) {
        boolean test = false;
        int numType =0 ;

        int len = word.length();

        if (len % 2 != 0)
            len -= 1;
         else
             numType = 1;

        for (int i=0;i<len/2;i++)
        {
           if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(len-i-numType))
               test = true;
           else {
               test = false;
               break;
           }
        }
        return test;
    }
}

public class Main {
    public static void main(String[] args)
    {
      //  System.out.println(Palindrome.isPalindrome("Deleveled"));
        System.out.println(Palindrome.isPalindrome("czazc"));

    }
}
