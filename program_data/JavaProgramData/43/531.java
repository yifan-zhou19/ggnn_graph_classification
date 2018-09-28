package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int i;
		int j;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (j = 3;j <= m / 2;j++)
		{
			p = 0;

			for (i = 2;i < j;i++)
			{
				if (j % i != 0)
				{
					p = p + 1;
				}
			}
			if (p == j - 2)
			{
				q = 0;

			for (i = 2;i < m - j;i++)
			{
				if ((m - j) % i != 0)
				{
					q = q + 1;
				}
			}
				if (q == m - j - 2)
				{
					System.out.printf("%d %d\n",j,m - j);
				}
			}
		}

	}

}

