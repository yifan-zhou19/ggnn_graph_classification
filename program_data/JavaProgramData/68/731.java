package <missing>;

public class GlobalMembers
{
	public static int su(int m)
	{
		int j;
		int k;
		k = Math.sqrt(m);
		for (j = 2;j <= k;j++)
		{
			if (m % j == 0)
			{
				return (0);
			}
		}
			return (m);
	}
	public static void Main()
	{
		int n;
		int p;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= n; i = i + 2)
		{
			for (p = 2;p < i;p++)
			{
				if (su(p) != 0 && su(i - p) != 0 && p <= i - p)
				{
					break;
				}
			}
			System.out.printf("%ld=%ld+%ld\n", i, p, i - p);
		}
	}
}

