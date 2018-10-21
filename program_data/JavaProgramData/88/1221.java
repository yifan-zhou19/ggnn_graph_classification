import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String c = new String(new char[31]);
	 int i;
	 int j;
	 int k;
	 c = new Scanner(System.in).nextLine();
	 for (i = 0;i < c.length();i++)
	 {
	  if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
	  {
	   System.out.print(c.charAt(i));
	  }
	  if (c.charAt(i - 1) >= '0' && c.charAt(i - 1) <= '9' && (c.charAt(i) < '0' || c.charAt(i)>'9'))
	  {
	   k = 0;
	   for (j = i + 1;j < c.length();j++)
	   {
		if (c.charAt(j) >= '0' && c.charAt(j) <= '9')
		{
		 k = 1;
		}
	   }
	   if (k == 1)
	   {
		System.out.print("\n");
	   }
	  }
	 }
	 return 0;
	}
}
