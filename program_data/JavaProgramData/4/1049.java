package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[m + 1][n + 1];
		for (int i = 1; i <= m; ++i)
		{
				for (int t = 1; t <= n; ++t)
				{
				array[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		int sum = 1;
		int[] x = {0, 0, 1};
		int[] y = {0, 1, 0};
		int dx = 1;
		int dy = 1;
		int k = 1;
		int tx;
		int ty;
		while (sum <= m * n)
		{
				  int xx = dx;
				  int yy = dy;
				  for (;;)
				  {
						 if (xx > m || yy < 1)
						 {
							 break;
						 }
						 System.out.print(array[xx][yy]);
						 System.out.print("\n");
						 xx = xx + 1, yy = yy - 1;
						 sum++;
				  }
				  tx = dx + x[k], ty = dy + y[k];
				  if (ty > n)
				  {
						k++;
						tx = dx + x[k], ty = dy + y[k];
				  }
				  dx = tx, dy = ty;
		}
		//while(1);
		return 0;
	}

}

