package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int q;
		int i;
		int j;
		int k;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= q;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= q;i++)
		{
			for (j = 1;j <= n;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= q;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				if (j == 1)
				{
					System.out.printf("\n%d",c[i][j]);
				}
				else
				{
					System.out.printf(" %d",c[i][j]);
				}
			}
		}
		return 0;
	}

}

