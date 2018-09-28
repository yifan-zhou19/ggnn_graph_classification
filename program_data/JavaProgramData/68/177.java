package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m = 6;
		int zyk = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (m <= n)
		{
			for (i = 3;i <= m / 2;i += 2)
			{
				if (zyk(i) == 1 && zyk(m - i) == 1)
				{
					System.out.printf("%d=%d+%d\n",m,i,m - i);
					break;
				}
			}
			m += 2;
		}

	}
	public static int zyk(int x)
	{
		int i;
		for (i = 3;i < Math.sqrt(x) + 1;i += 2)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
}

