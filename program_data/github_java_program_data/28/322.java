import java.util.Scanner;
class TestClass {
    public static void main(String args[] ){
    Scanner input = new Scanner(System.in);
    Boolean yes=false;
    String str = input.nextLine();
    char s[] = str.toCharArray();
    int l = str.length();
    int m=l/2-1;
    int i=0;
    while(i<=m){
        if(s[i]==s[l-i-1])
           {
            yes = true;
            }
        else
           {
            yes = false;
            break;
           }
        i++;
    }
    
    if(yes)
        System.out.println("YES");
    else
        System.out.println("NO");
    }
}
