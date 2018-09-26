package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a;
		int b;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m / 2;
		for (i = 3;i <= a;i++)
		{
			b = 0;
			j = m - i;
			if (i == 3)
			{
				b = 0;
			}
			else
			{
				for (p = 2;p < i;p++)
				{
					if (i % p == 0)
					{
						b = 1;
					}
				}
			}
			if (j == 3)
			{
				b = 0;
			}
			else
			{
				for (q = 2;q < j;q++)
				{
					if (j % q == 0)
					{
					b = 1;
					}
				}
			}
			if (b == 0)
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		return 0;
	}

}

