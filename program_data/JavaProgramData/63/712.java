package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int[][] b = new int[100][100];
	public static int[][] c = new int[100][100];
	public static int Main()
	{
		int m;
		int n;
		int s;
		int t;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 100;i++)
		{
		  for (j = 1;j <= 100;j++)
		  {
		  a[i][j] = b[i][j] = c[i][j] = 0;
		  }
		}
		for (i = 1;i <= m;i++)
		{
		  for (j = 1;j <= n;j++)
		  {
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= s;i++)
		{
		  for (j = 1;j <= t;j++)
		  {
			b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		for (i = 1;i <= m;i++)
		{
		  for (j = 1;j <= t;j++)
		  {
			for (k = 1;k <= n;k++)
			{
			c[i][j] = c[i][j] + a[i][k] * b[k][j];
			}
		  }
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= t - 1;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.print(c[i][t]);
			System.out.print("\n");
		}

		return 0;
	}
}

