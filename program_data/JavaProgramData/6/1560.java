package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int h;
		int i;
		int j;
		int a;
		int b;
		int[][] s = new int[100][100];
		int[] r = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int t = 0;t <= k - 1;t++)
		{
			h = 0;
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
			for (i = 0;i <= m - 1;i++)
			{
				for (j = 0;j <= n - 1;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						s[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (a = 0;a <= n - 1;a++)
			{
				h = h + s[0][a] + s[m - 1][a];
			}
			for (b = 1;b <= m - 2;b++)
			{
				h = h + s[b][0] + s[b][n - 1];
			}
			r[t] = h;
		}
		for (int x = 0;x <= k - 1;x++)
		{
			 System.out.printf("%d\n",r[x]);
		}
	return 0;
	}

}

