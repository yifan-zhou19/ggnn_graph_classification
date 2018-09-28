import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int detc(char m)
	{
		if (m >= 48 && m <= 57)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String c = new String(new char[30]);
		int i;
		int j;
		int k;
		int m;
		int n;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i <= n - 1;i++)
		{
			if ((i == 0 && detc(c.charAt(i)) == 1) || i != 0 && detc(c.charAt(i)) != 0 && detc(c.charAt(i - 1)) == 0)
			{
				for (j = 0;detc(c.charAt(i + j)) == 1;j++)
				{
					System.out.print(c.charAt(i + j));
				}
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		return 0;
	}

}
