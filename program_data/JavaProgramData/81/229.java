package <missing>;

public class GlobalMembers
{
	public static int x(int m, int n, int[][] sz)
	{
		int[][] ty = new int[1][5];
		int i;
		if (m >= 0 && m < 5 && n < 5 && n >= 0)
		{
			for (i = 0;i < 5;i++)
			{
			   ty[0][i] = sz[m][i];
			   sz[m][i] = sz[n][i];
			   sz[n][i] = ty[0][i];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (x(m, n, sz) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
					   System.out.printf("%d\n",sz[i][j]);
					}
					else
					{
						System.out.printf("%d ",sz[i][j]);
					}
				}
			}
		}
		else if (x(m, n, sz) == 0)
		{
			System.out.print("error");
		}
		return 0;
	}
}

