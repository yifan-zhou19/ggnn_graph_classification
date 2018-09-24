package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			k = n - i;
			l = 1;
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					l = 0;
					break;
				}
			}
			if (l == 1)
			{
				l = 1;
				for (j = 2;j <= Math.sqrt(k);j++)
				{
					if (k % j == 0)
					{
						l = 0;
						break;
					}
				}
				if (l == 1)
				{
					System.out.printf("%d %d\n",i,k);
				}
			}
		}
		return 0;
	}

}

