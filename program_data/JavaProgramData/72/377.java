package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][20];
		int i;
		int j;
		int max;
		int m;
		int n;
		int flag = 1;
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
				flag = 1;
				if (j - 1 >= 0)
				{
					if (a[i][j] < a[i][j - 1])
					{
						flag = 0;
					}
				}
				if (i - 1 >= 0)
				{
					if (a[i][j] < a[i - 1][j])
					{
						flag = 0;
					}
				}
				if (j + 1 < n)
				{
					if (a[i][j] < a[i][j + 1])
					{
						flag = 0;
					}
				}
				if (i + 1 < m)
				{
					if (a[i][j] < a[i + 1][j])
					{
						flag = 0;
					}
				}
				if (flag == 1)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

