package <missing>;

public class GlobalMembers
{
	public static int p(int n)
	{
		int j;
		int b;
		if (n < 2)
		{
			return 0;
		}
		b = (int)Math.sqrt(n);
		if (n == 2)
		{
			return 1;
		}
		for (j = 2;j <= b;j++)
		{
			if (n % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 2;j <= m / 2;j += 1)
		{
			if (p(j) != 0 && p(m - j) != 0)
			{
				System.out.printf("%d %d\n\n",j,m - j);
			}
		}
		return 0;
	}

}

