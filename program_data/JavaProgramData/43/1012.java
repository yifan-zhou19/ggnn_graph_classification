package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int j;
		int i;
		int l;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 3;n <= m / 2;n++)
		{
			p = Math.sqrt(n);
			for (i = 2;i <= p;i++)
			{
				if (n % i == 0)
				{
					break;
				}
			}
			if (i > p)
			{
				k = m - n;
				l = Math.sqrt(k);
				for (j = 2;j <= l;j++)
				{
						if (k % j == 0)
						{
							break;
						}
				}
				if (j > l)
				{
					System.out.printf("%d %d\n",n,k);
				}
			}


		}
		return 0;
	}
}

