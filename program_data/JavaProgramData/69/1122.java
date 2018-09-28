import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		int[] a3 = new int[301];
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int len1 = s1.length();
		int len2 = s2.length();
		for (int i = 300; (i > 300 - len1 || i > 300 - len2) ;i--)
		{
			if (len1 + i - 301 >= 0)
			{
			a3[i] += (int)(s1.charAt(len1 + i - 301)) - 48;
			}
			if (len2 + i - 301 >= 0)
			{
			a3[i] += (int)(s2.charAt(len2 + i - 301)) - 48;
			}
			if (a3[i] >= 10)
			{
				a3[i] -= 10;
				a3[i - 1]++;
			}
		}
		int k = 0;
		for (int i = 1; i <= 300;i++)
		{
			if (a3[i] != 0)
			{
				k = 1;
			}
			if (k == 1)
			{
				System.out.print(a3[i]);
			}
		}
		if (k == 0)
		{
			System.out.print(0);
		}
	}
}
