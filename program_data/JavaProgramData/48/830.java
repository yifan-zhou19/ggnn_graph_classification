package <missing>;

public class GlobalMembers
{
	public static void f(int[][] a, int m)
	{
		if (m == 0)
		{
			return;
		}
		int i;
		int j;
		int[][] b = new int[12][12];
		for (i = 1;i <= 9;i++)
		{
		  for (j = 1;j <= 9;j++)
		  {
				if (a[i][j] != 0)
				{
					  b[i][j] = b[i][j] + 2 * a[i][j];
					 b[i + 1][j] = b[i + 1][j] + a[i][j];
					 b[i - 1][j] = b[i - 1][j] + a[i][j];
					 b[i + 1][j + 1] = b[i + 1][j + 1] + a[i][j];
					 b[i + 1][j - 1] = b[i + 1][j - 1] + a[i][j];
					 b[i - 1][j - 1] = b[i - 1][j - 1] + a[i][j];
					 b[i - 1][j + 1] = b[i - 1][j + 1] + a[i][j];
					 b[i][j + 1] = b[i][j + 1] + a[i][j];
					 b[i][j - 1] = b[i][j - 1] + a[i][j];
				}
		  }
		}
		for (i = 1;i <= 9;i++)
		{
		  for (j = 1;j <= 9;j++)
		  {
				a[i][j] = b[i][j];
		  }
		}
		f(a, m - 1);
	}
	public static int Main()
	{
		int[][] a = new int[12][12];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;
		f(a, m);
		int i;
		int j;
		for (i = 1;i <= 9;i++)
		{
			  for (j = 1;j < 9;j++)
			  {
				   System.out.print(a[i][j]);
				   System.out.print(' ');
			  }
			 System.out.print(a[i][9]);
			 System.out.print("\n");
		}
		return 0;
	}
}

