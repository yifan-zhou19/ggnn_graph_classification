package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int n;
		int m;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int k;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= s - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
				for (j = 0;j <= m - 1;j++)
				{
					b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (i = 0;i <= 99;i++)
		{
			for (j = 0;j <= 99;j++)
			{
				c[i][j] = 0;
			}
		}
		for (i = 0;i <= s - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				for (k = 0;k <= n - 1;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0;i <= s - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				if (j != m - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

