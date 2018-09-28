package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[20][20];
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (i == 0 || (i > 0 && a[i - 1][j] <= a[i][j]))
				{
					if (i == m - 1 || (i < m - 1 && a[i + 1][j] <= a[i][j]))
					{
						if (j == 0 || (j > 0 && a[i][j - 1] <= a[i][j]))
						{
							if (j == n - 1 || (j < n - 1 && a[i][j + 1] <= a[i][j]))
							{
								System.out.print(i);
								System.out.print(" ");
								System.out.print(j);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}

		return 0;
	}




}

