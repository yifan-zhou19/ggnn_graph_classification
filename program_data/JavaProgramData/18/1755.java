package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < n;k++)
		{
			int[][] a = new int[100][100];
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int ans = 0;
			for (int nn = n;nn > 1;nn--)
			{
				for (int i = 0;i < nn;i++)
				{
					int min = a[i][0];
					for (int j = 1;j < nn;j++)
					{
						if (min > a[i][j])
						{
							min = a[i][j];
						}
					}
					for (int j = 0;j < nn;j++)
					{
						a[i][j] -= min;
					}
				}
				for (int i = 0;i < nn;i++)
				{
					int min = a[0][i];
					for (int j = 1;j < nn;j++)
					{
						if (min > a[j][i])
						{
							min = a[j][i];
						}
					}
					for (int j = 0;j < nn;j++)
					{
						a[j][i] -= min;
					}
				}
				ans += a[1][1];
				for (int i = 1;i < nn;i++)
				{
					for (int j = 0;j < nn;j++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (int j = 1;j < nn;j++)
				{
					for (int i = 0;i < nn;i++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

