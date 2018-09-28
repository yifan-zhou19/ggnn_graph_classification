package <missing>;

public class GlobalMembers
{
	public static int g(int[][] c, int v, int u)
	{
		int[][] b = new int[1][5];
		int i;
			if (v >= 0 && v < 5 && u >= 0 && u < 5)
			{
				for (i = 0;i < 5;i++)
				{
				 b[0][i] = c[v][i];
				 c[v][i] = c[u][i];
				 c[u][i] = b[0][i];
				}
				 return (1);
			}
			else
			{
				return (0);
			}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
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
			g(a, m, n);
			if (g(a, m, n) == 0)
			{
				System.out.print("error");
			}
			else if (g(a, m, n) == 1)
			{
				for (i = 0;i < 5;i++)
				{
				for (j = 0;j < 5;j++)
				{
				if (j / 4 == 0)
				{
					System.out.printf("%d ",a[i][j]);
				}
				else if (j / 4 == 1)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				}
				}
			}
	}
}

