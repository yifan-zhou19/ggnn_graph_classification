package <missing>;

public class GlobalMembers
{
	public static int dis(int x, int y)
	{
		int min;
		int m;
		int i;
		int j;

		for (min = x + y;;min += x)
		{
			m = min;
			for (i = 1;i <= x;i++)
			{
				if (m % x != y)
				{
					j = 1;
					break;
				}
				m = m - y - m / x;
			}
			if (j == 0 && m > 0)
			{
				break;
			}
			j = 0;
		}
		return (min);
	}
	public static int Main()
	{
		int m;
		int n;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = dis(n, k);
		System.out.printf("%d\n",m);
		return 0;
	}
}

