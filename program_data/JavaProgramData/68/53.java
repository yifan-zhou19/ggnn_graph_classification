package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k;
		int q;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k += 2)
		{
			for (j = 3;j <= k;j += 2)
			{
				q = 0;
				for (i = 2;i <= Math.sqrt(j);i++)
				{
					if (j % i == 0)
					{
						q = 1;
						break;
					}
				}
				if (q == 0)
				{
					f = k - j;
					for (i = 2;i <= Math.sqrt(f);i++)
					{
						if (f % i == 0)
						{
							q = 1;
							break;
						}
					}
				}
				if (q == 0)
				{
					System.out.printf("%d=%d+%d\n",k,j,f);
					break;
				}

			}
		}
		return 0;
	}
}

