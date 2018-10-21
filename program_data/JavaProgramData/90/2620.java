package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (e = 0;e < N;e++)
		{
			int m;
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			int i;
			int j;
			int k;
			int t;
			int[][] f = new int[100][100];
			for (i = 1;i <= n;i++)
			{
				for (j = 0;j <= m;j++)
				{
					if (i == 1 || j == 0 || j == 1)
					{
						f[i][j] = 1;
					}
					else
					{
						if (j >= i)
						{
						f[i][j] = f[i][j - i] + f[i - 1][j];
						}
						else
						{
						f[i][j] = f[i - 1][j];
						}
					}
				}
			}
			System.out.printf("%d\n",f[n][m]);
		}
	}




}

