import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[500]);

	public static void checkTheSame(String t, int n)
	{
		int len;
		int i;
		int j;
		int k;
		int p;
		len = t.length();
		for (i = 0; i < len - n; i++)
		{
			j = i + n;
			k = i;
			while (j > k)
			{
				if (a.charAt(k) != a.charAt(j))
				{
					break;
				}
				k++;
				j--;
			}
			if (j <= k)
			{
				for (p = i; p <= i + n; p++)
				{
					System.out.print(t[p]);
				}
				System.out.print("\n");
			}
		}
	}

	public static int Main()
	{
		int n = 1;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (n = 1; n < len; n++)
		{
			checkTheSame(a, n);
		}
		return 0;
	}
}
