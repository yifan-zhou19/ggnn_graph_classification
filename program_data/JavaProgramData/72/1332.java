package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[20][20];
		int k = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
					if (j + 1 < n)
					{
						if (a[i][j] >= a[i][j + 1])
						{
							k++;
						}
					}
					else
					{
						k++;
					}
					if (j - 1 >= 0)
					{
						if (a[i][j] >= a[i][j - 1])
						{
							k++;
						}
					}
					else
					{
						k++;
					}
					if (i + 1 < m)
					{
						if (a[i][j] >= a[i + 1][j])
						{
							k++;
						}
					}
					else
					{
						k++;
					}
					if (i - 1 >= 0)
					{
						if (a[i][j] >= a[i - 1][j])
						{
							k++;
						}
					}
					else
					{
						k++;
					}
					if (k == 4)
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
					k = 0;
			}
		}
		return 0;
	}
}

