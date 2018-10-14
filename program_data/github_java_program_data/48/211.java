
public class Palindrome {

    static int globalCost = 0;

    public static boolean checkPalindrome(String s) {
        StringBuilder temp = new StringBuilder(s);
        if (temp.reverse().toString().equals(s)) {
            System.out.println(temp.reverse().toString() + " == " + s);
            return true;
        }
        return false;
    }

    public static String makePalindrome(String base) {
        String pref = "";
        StringBuffer str = new StringBuffer(base);
        int i = str.length() - 1;
        int k = 0;

        while (!checkPalindrome(str.toString())) {
            String reps = "";
            StringBuffer temp = str.replace(i, i + 1, reps + str.charAt(k));
            System.out.println("Replacing 1st char=" + temp);
            if (checkPalindrome(temp.toString())) {
                str = temp;
                globalCost++;
                System.out.println(str.toString() + " is palindrome");
                break;
            } else {

                temp.deleteCharAt(i);
                if (checkPalindrome(temp.toString())) {
                    str = temp;
                    System.out.println(str.toString() + " is palindrome");
                    globalCost++;
                    break;
                } else {
                    makePalindrome(str.toString());
                    globalCost++;
                }
            }
            i--;
            // k++;
        }
        System.out.println("Cost =" + (globalCost - 1));
        return str.toString();
    }

    public static void main(String args[]) {
        boolean st = Palindrome.checkPalindrome("Pixil");
        //System.out.println(st);
        String Pali = Palindrome.makePalindrome("Pixil");
    }
}
