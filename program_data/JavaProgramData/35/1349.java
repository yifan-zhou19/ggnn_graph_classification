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
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[8][8];
		int[][] h = new int[8][8];
		int[][] l = new int[8][8];
		int i;
		int j;
		int a;
		int b;
		int c = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				h[i][j] = sz[i][j];
				l[i][j] = sz[i][j];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (h[i][j] > h[i][j + 1])
				{
					a = h[i][j];
					h[i][j] = h[i][j + 1];
					h[i][j + 1] = a;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m - 1;i++)
			{
				if (l[i][j] < l[i + 1][j])
				{
					b = l[i][j];
					l[i][j] = l[i + 1][j];
					l[i + 1][j] = b;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((sz[i][j] == h[i][n - 1]) && (sz[i][j] == l[m - 1][j]))
				{
					System.out.printf("%d+%d",i,j);
				}
				else
				{
					c++;
				}
			}
		}
		if (c == m * n)
		{
			System.out.print("No");
		}
		return 0;
	}



}

