package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] num = new int[30][30];
		int cnt = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
			num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int j = 1;j <= n;j++)
		{
			num[0][j] = num[1][j];
		}
		for (int i = 1;i <= m;i++)
		{
			num[i][0] = num[i][1];
			num[i][n + 1] = num[i][n];
		}
		for (int j = 1;j <= n;j++)
		{
			num[m + 1][j] = num[m][j];
		}
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
					int word = 0;
					{
					word += (num[i - 1][j] <= num[i][j]);
					word += (num[i + 1][j] <= num[i][j]);
					word += (num[i][j - 1] <= num[i][j]);
					word += (num[i][j + 1] <= num[i][j]);
					}
				if (word == 4)
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

