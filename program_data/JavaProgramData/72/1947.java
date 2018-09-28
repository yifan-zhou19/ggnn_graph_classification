package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int a = m + 2;
		int b = n + 2;
		int[][] sz = new int[a][b];
		for (int i = 0;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
				sz[i][j] = 0;
			}
		}
		for (int i = 1;i < a - 1;i++)
		{
			for (int j = 1;j < b - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 1;i < a - 1;i++)
		{
			for (int j = 1;j < b - 1;j++)
			{
				if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i][j - 1])
				{
					int c = i - 1;
					int d = j - 1;
					System.out.printf("%d %d\n",c, d);
				}
			}
		}
		return 0;
	}

}

