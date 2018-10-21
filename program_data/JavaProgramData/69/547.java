package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] c = new int[251];
		int[] d = new int[251];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int m = a.length();
		int n = b.length();
		for (int i = m - 1,j = 0;i >= 0;i--,j++)
		{
			c[j] = a.charAt(i) - '0';
		}
		for (int k = n - 1,j = 0;k >= 0;k--,j++)
		{
			d[j] = b.charAt(k) - '0';
		}
		for (int i = 0;i < 251;i++)
		{
			if (c[i] + d[i] < 10)
			{
				c[i] += d[i];
			}
			else
			{
				c[i] = c[i] + d[i] - 10;
				c[i + 1]++;
			}
		}
		int i = 250;
		for (;c[i] == 0 && i >= 0;i--)
		{
			;
		}
		if (i == -1)
		{
			System.out.print(0);
		}
		else
		{
		for (;i >= 0;i--)
		{
			System.out.print(c[i]);
		}
		}
		return 0;
	}
}

