package <missing>;

public class GlobalMembers
{
	public static int Main() //????
	{
		final int MAX = 50000;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < n;k++)
		{
			int[][] jz = new int[110][110];
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					jz[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int ans = 0;
			for (int x = 0;x < n - 1;x++)
			{
				for (int i = 0;i < n - x;i++)
				{
					int min = MAX;
					for (int j = 0;j < n - x;j++)
					{
						if (jz[i][j] < min)
						{
							min = jz[i][j];
						}
					}
					for (int j = 0;j < n - x;j++)
					{
						jz[i][j] -= min;
					}
				}
				for (int i = 0;i < n - x;i++)
				{
					int min = MAX;
					for (int j = 0;j < n - x;j++)
					{
						if (jz[j][i] < min)
						{
							min = jz[j][i];
						}
					}
					for (int j = 0;j < n - x;j++)
					{
						jz[j][i] -= min;
					}
				}
				ans += jz[1][1];
				for (int i = 0;i < n - x;i++)
				{
					for (int j = 2;j < n - x;j++)
					{
						jz[i][j - 1] = jz[i][j];
					}
				}
				for (int i = 0;i < n - x;i++)
				{
					for (int j = 2;j < n - x;j++)
					{
						jz[j - 1][i] = jz[j][i];
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

