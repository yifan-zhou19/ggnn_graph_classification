import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[1000]);
	   a = new Scanner(System.in).nextLine();
	   int len = a.length();
	   int i;
	   int j;
	   int k;
	   int l;
	   for (j = 2;j <= len;j++)
	   {
		   for (i = 0;i <= len - j;i++)
		   {
			   int k;
			   for (k = i;k < i + j && a.charAt(k) == a.charAt(i + j - (k - i) - 1);k++)
			   {
				   ;
			   }
			   if (k == i + j)
			   {
				   for (int t = i;t < i + j;t++)
				   {
					   System.out.print(a.charAt(t));
				   }
			   System.out.print("\n");
			   }
		   }
	   }
	   return 0;
	}

}
