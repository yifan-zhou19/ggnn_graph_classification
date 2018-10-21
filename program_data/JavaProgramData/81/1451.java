package <missing>;

public class GlobalMembers
{
	public static int change(int[][] sz, int n, int m)
	{
		int i;
		int e;
		if ((n >= 0 && n <= 4) && (m >= 0 && m <= 4))
		{
			for (i = 0;i < 5;i++)
			{
				e = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = e;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
		int[][] sz = new int[5][5];
		int i;
		int j;
		int n;
		int m;
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
		if (change(sz, n, m) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz[i][j]);
				}
				if (j == 4)
				{
					System.out.printf("%d\n",sz[i][j]);
				}
			}
		}
		else
		{
			System.out.print("error");
		}
	}

}

