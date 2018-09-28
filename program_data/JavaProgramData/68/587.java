package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = int x;
		int a;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m <= 50000)
		{
		for (n = 6;n <= m;n = n + 2)
		{
			for (a = 3;a <= n / 2;a = a + 2)
			{
				if (s(a) + s(n - a) == 2)
				{
					break;
				}
			}
		System.out.printf("%d=%d+%d\n",n,a,n - a);
		}
		}

	}

	public static int s(int x)
	{
		int i;
		for (i = 3;i <= x / 2;i = i + 2)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i > x / 2)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

