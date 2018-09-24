package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int q;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (m = 3;m < i - 2;m++)
			{
				p = Math.sqrt(m);
				q = Math.sqrt(i - m);
				for (j = 2;j <= p;j++)
				{
				if (m % j == 0)
				{
					break;
				}
				}
				for (k = 2;k <= q;k++)
				{
				if ((i - m) % k == 0)
				{
					break;
				}
				}
				if (j == (p + 1) && k == (q + 1))
				{
					break;
				}
			}
			System.out.printf("%d=%d+%d\n",i,m,i - m);
		}
	}
}

