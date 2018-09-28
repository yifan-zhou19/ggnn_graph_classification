package <missing>;

public class GlobalMembers
{
	public static int p(int a)
	{
		int i;
		for (i = 2; i <= Math.sqrt(a); i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= n; i += 2)
		{
			for (t = 2; t <= i / 2; t++)
			{
				if (p(t) != 0)
				{
					if (p(i - t) != 0)
					{
						System.out.printf("%ld=%ld+%ld\n", i, t, i - t);
						break;
					}
				}
			}
		}
		return 0;
	}
}

