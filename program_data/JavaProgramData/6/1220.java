package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] a = new int[101][101];
			int m;
			int n;
			int k;
			int i;
			int j;
			int t;
			int[] sum = new int[1001];
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1 ; i <= k ; i++)
			{
					m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					for (t = 1 ; t <= m ; t++)
					{
						for (j = 1 ; j <= n ; j++)
						{
								a[t][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
					}
					for (j = 1 ; j <= n ; j++)
					{
						sum[i] = sum[i] + a[1][j] + a[m][j];
					}
					for (j = 1 ; j <= m ; j++)
					{
							if (j == 1 || j == m)
							{
								continue;
							}
							sum[i] = sum[i] + a[j][1] + a[j][n];
					}
			}
			for (i = 1 ; i <= k ; i++)
			{
				System.out.print(sum[i]);
				System.out.print("\n");
			}
			return 0;
	}
}

