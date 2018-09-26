package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] s1 = new int[8][8];
		int[][] s2 = new int[8][8];
		int[][] h = new int[8][8];
		int[][] l = new int[8][8];
		int i;
		int j;
		int k;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s1[i][j] = Integer.parseInt(tempVar3);
				}
				s2[i][j] = s1[i][j];
				h[i][j] = i;
				l[i][j] = j;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				for (k = 0;k < m - j;k++)
				{
					if (s1[i][k] > s1[i][k + 1])
					{
						e = s1[i][k];
						s1[i][k] = s1[i][k + 1];
						s1[i][k + 1] = e;
						e = h[i][k];
						h[i][k] = h[i][k + 1];
						h[i][k + 1] = e;
					}
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			for (i = 1;i <= n;i++)
			{
				for (k = 0;k < n - i;k++)
				{
					if (s2[k][j] > s2[k + 1][j])
					{
						e = s2[k][j];
						s2[k][j] = s2[k + 1][j];
						s2[k + 1][j] = e;
						e = l[k][j];
						l[k][j] = l[k + 1][j];
						l[k + 1][j] = e;
					}
				}
			}
		}
		e = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (s2[0][j] == s1[i][m - 1])
				{
					e++;
					System.out.printf("%d+%d\n",h[i][m - 1],l[0][j]);
				}
			}
		}
		if (e == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

