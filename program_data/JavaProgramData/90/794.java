package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] f = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (;t >= 1;t--)
		{
			for (i = 0;i <= 100;i++)
			{
				f[1][i] = 1;
			}
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
			for (i = 2;i <= n;i++)
			{
				for (j = 0;j <= m;j++)
				{
					f[i][j] = f[i - 1][j];
					if (j >= i)
					{
						f[i][j] = f[i][j] + f[i][j - i];
					}
				}
			}
			System.out.printf("%ld\n",f[n][m]);
		}
		return 0;
	}

}

