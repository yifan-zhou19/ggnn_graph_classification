package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] mount =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				mount[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int k;
		for (k = 0 ; k <= n + 1 ; k++)
		{
			mount[0][k] = 0;
			mount[m + 1][k] = 0;
		}
		for (k = 0 ; k <= m + 1 ; k++)
		{
			mount[k][0] = 0;
			mount[k][n + 1] = 0;
		}
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				if (mount[i][j] >= mount[i + 1][j] != 0 && mount[i][j] >= mount[i - 1][j] != 0 && mount[i][j] >= mount[i][j + 1] != 0 && mount[i][j] >= mount[i][j - 1])
				{
						System.out.print(i - 1);
						System.out.print(" ");
						System.out.print(j - 1);
						System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

