import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void f(int n, String s, int len)
	{
		int j;
		int p;
		int k;
		for (j = 0;j <= len - n;j++)
		{
		 for (p = j;p <= j + n - 1;p++)
		 {
			 if (!s[p].equals(s[2 * j + n - 1 - p]))
			 {
				 break;
			 }
		 }
		 if (p == j + n)
		 {
			 for (k = j;k <= j + n - 1;k++)
			 {
				 System.out.print(s[k]);
			 }
			 System.out.print("\n");
		 }
		}
	}

	public static int Main()
	{
		String s = new String(new char[520]);
		s = new Scanner(System.in).nextLine();
		int i;
		int len;
		len = s.length();
		for (i = 2;i <= len;i++)
		{
			f(i, s, len);
		}
		return 0;
	}
}
