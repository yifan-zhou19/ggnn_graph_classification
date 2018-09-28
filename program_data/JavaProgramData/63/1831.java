package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int m;
		int n;
		int c;
		int d;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		int[][] v1 = new int[m + 1][n + 1];
		for (a = 1;a <= m;a++)
		{
						 for (b = 1;b <= n;b++)
						 {
										  v1[a][b] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 }

		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] v2 = new int[c + 1][d + 1];
		for (a = 1;a <= c;a++)
		{
						 for (b = 1;b <= d;b++)
						 {
										  v2[a][b] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 }
		}
		int[][] v3 = new int[m + 1][d + 1];
		for (int i = 1;i <= m;i++)
		{
					  for (int j = 1;j <= d;j++)
					  {
							  v3[i][j] = 0;
							  for (int b = 1;b <= n;b++)
							  {
							  v3[i][j] = v3[i][j] + v1[i][b] * v2[b][j];
							  }
					  }
		}
		for (i = 1;i <= m;i++)
		{
						 for (j = 1;j < d;j++)
						 {
										  System.out.print(v3[i][j]);
										  System.out.print(" ");
						 }
						 System.out.print(v3[i][d]);
						 System.out.print("\n");
		}
		return 0;
	}
}

