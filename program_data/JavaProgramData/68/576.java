package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
			for (i = 3;i <= n / 2;i++)
			{
				p = Math.sqrt(i);
				for (m = 2;m <= p;m++)
				{
				if (i % m == 0)
				{
					break;
				}
				}
				if (m > p)
				{
					j = k - i;
					q = Math.sqrt(j);
					for (m = 2;m <= q;m++)
					{
					if (j % m == 0)
					{
						break;
					}
					}
					if (m > q)
					{
						System.out.printf("%d=%d+%d\n",k,i,j);
						break;
					}
				}
			}
		}
	}
}

