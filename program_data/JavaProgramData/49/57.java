import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*         ????
	??????        2010.11.24      */

	public static void f(int sta, int len, String a)
	{
		int g = 0;
		int i;
		for (i = 0;i < len - 1 - i;i++)
		{
			if (!a[i + sta].equals(a[sta + len - 1 - i]))
			{
				g = 1;
				break;
			}
		}
		if (g == 0)
		{
			for (i = sta;i < sta + len;i++)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int len;
		int sta;
		final String a = "";
		a = new Scanner(System.in).nextLine();
		for (len = 2;len <= a.length();len++)
		{
			for (sta = 0;sta + len <= a.length();sta++)
			{
				f(sta, len, a);
			}
		}
		return 0;
	}
}
