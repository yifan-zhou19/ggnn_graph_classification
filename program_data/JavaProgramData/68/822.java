package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 2;j <= i;j++)
			{
				k = Math.sqrt(j);
				for (t = 2;t <= k;t++)
				{
					if (j % t == 0)
					{
						break;
					}
				}
				if (t == k + 1)
				{
					m = i - j;
					k = Math.sqrt(m);
					for (t = 2;t <= k;t++)
					{
						if (m % t == 0)
						{
							break;
						}
					}
				if (t == k + 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,m);
					break;
				}
				}

			}
		}
	}

}

