package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int q;
		int r;
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (q = 3;q <= m / 2;q++)
		{
			r = m - q;
		 a = 0;
		 b = 0;
			for (i = 2;i <= Math.sqrt(q);i++)
			{
				if (q % i == 0)
				{
					a = 1;
				}
			}
			for (j = 2;j <= Math.sqrt(r);j++)
			{
				if (r % j == 0)
				{
					b = 1;
				}
			}
			if (a == 0 && b == 0)
			{
				System.out.printf("%d %d\n",q,r);
			}

		}

	}
}

