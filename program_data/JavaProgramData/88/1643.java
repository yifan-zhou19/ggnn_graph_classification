import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		int k;
		 String a = new String(new char[31]);
		 a = new Scanner(System.in).nextLine();
		 l = a.length();
		 j = 0;
		 for (i = 0; i <= l; i++)
		 {
			 if (a.charAt(i) < '0' || a.charAt(i) > '9' || i == l)
			 {
				 for (k = j; k < i; k++)
				 {
					 System.out.print(a.charAt(k));
					 if (k == (i - 1))
					 {
						 System.out.print("\n");
					 }
				 }
				 j = i + 1;
			 }
		 }
		 return 0;
	}
}
