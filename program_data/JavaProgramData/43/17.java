package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 2;i <= (m / 2);i++)
		{
			if ((i % 2) == 0)
			{
				a = 1;
			}
			for (k = 2;k < i;k++)
			{
				if ((i % k) == 0)
				{
					b = 1;
				}
			}
			for (k = 2;k < (m - i);k++)
			{
				if ((m - i) % k == 0)
				{
					c = 1;
				}
			}
			if ((a == 0) && (b == 0) && (c == 0))
			{
				System.out.printf("%d %d\n",i,m - i);
			}
			a = 0;
			b = 0;
			c = 0;
		}
		return 0;
	}
}

