import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[510]);
	public static int[] flag = new int[510];
	public static int check(int head, int n)
	{
		if (n == 0)
		{
			return 1;
		}
		if (n == -1)
		{
			return 1;
		}
		if (str.charAt(head) == str.charAt(head + n))
		{
			return check(head + 1, n - 2);
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int len;
		int i;
		int m = 1;
		int k;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (m = 1; m < len; m++)
		{
			for (i = 0; i <= len - m; i++)
			{
				if (check(i, m) == 1)
				{
					for (k = i;k <= i + m;k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
