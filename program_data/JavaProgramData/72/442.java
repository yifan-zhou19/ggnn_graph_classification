package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[30][30];
		int i;
		int j;
		int m;
		int n;
		int flag;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				flag = 1;
				if (j > 0)
				{
					if (a[i][j - 1] > a[i][j])
					{
						flag = 0;
						continue;
					}
				}
				if (j < n - 1)
				{
					if (a[i][j] < a[i][j + 1])
					{
						flag = 0;
						continue;

					}
				}
				if (i > 0)
				{
					if (a[i - 1][j] > a[i][j])
					{
						flag = 0;
						continue;

					}
				}
				if (i < m - 1)
				{
					if (a[i][j] < a[i + 1][j])
					{
						flag = 0;
						continue;

					}
				}
				if (flag == 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

