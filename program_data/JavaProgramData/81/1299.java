package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		if (n >= 5 || m >= 5 || m < 0 || n < 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int[] a = new int[5];
		int i;
		int j;
		int m;
		int n;
		int[][] sz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (f(n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				a[i] = sz[m][i];
				sz[m][i] = sz[n][i];
				sz[n][i] = a[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j <= 3)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					else
					{
						System.out.printf("%d\n",sz[i][j]);
					}
				}

			}
		}
		return 0;
	}
}

