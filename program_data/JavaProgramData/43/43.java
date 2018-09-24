package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3; i <= m / 2; i++)
		{
			a = 0;
			b = 0;
			for (j = 2; j <= i - 1; j++)
			{
				if (i % j == 0)
				{
					a = 1;
					break;
				}
			}
			if (a == 0)
			{
				for (j = 2; j <= m - i - 1; j++)
				{
					if ((m - i) % j == 0)
					{
						b = 1;
						break;
					}
				}
				if (b == 0)
				{
					System.out.printf("%d %d\n", i, m - i);
				}
			}
		}
		return 0;
	}
}

