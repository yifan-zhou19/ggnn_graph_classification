package <missing>;

public class GlobalMembers
{
	public static int exchange(int a,int b)
	{
		if (a >= 0 && a < 5 && b >= 0 && b < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int t = 0;
		int panduan;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		panduan = exchange(n, m);
		if (panduan != 0)
		{
			for (k = 0;k < 5;k++)
			{
				t = sz[n][k];
				sz[n][k] = sz[m][k];
				sz[m][k] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
					System.out.printf("%d ",sz[i][j]);
					}
					else if (j = 4)
					{
						System.out.printf("%d\n",sz[i][j]);
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

