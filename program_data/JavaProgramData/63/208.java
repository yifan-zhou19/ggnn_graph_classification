package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;
		int n;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					for (i = 0;i <= x1 - 1;i++)
					{
						for (j = 0;j <= y1 - 1;j++)
						{
						   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
					}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					for (i = 0;i <= x2 - 1;i++)
					{
						for (j = 0;j <= y2 - 1;j++)
						{
						   b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
					}
			  n = x2;
			  for (i = 0;i <= x1 - 1;i++)
			  {
				  for (j = 0;j <= y2 - 1;j++)
				  {
					  c[i][j] = 0;
					 for (k = 0;k <= n - 1;k++)
					 {
					   c[i][j] = c[i][j] + a[i][k] * b[k][j];
					 }
				  }
			  }

			for (i = 0;i <= x1 - 2;i++)
			{
				for (j = 0;j <= y2 - 2;j++)
				{
				System.out.print(c[i][j]);
				System.out.print(" ");
				}
				System.out.print(c[i][y2 - 1]);
				System.out.print("\n");
			}
			for (j = 0;j <= y2 - 2;j++)
			{
				System.out.print(c[x1 - 1][j]);
				System.out.print(" ");
			}
			System.out.print(c[x1 - 1][y2 - 1]);
	return 0;
	}
}

