package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < m ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i < m ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				if (i - 1 >= 0)
				{
					if (a[i - 1][j] > a[i][j])
					{
					continue;
					}
				}
				if (i + 1 < m)
				{
					if (a[i + 1][j] > a[i][j])
					{
					continue;
					}
				}
				if (j - 1 >= 0)
				{
					if (a[i][j - 1] > a[i][j])
					{
					continue;
					}
				}
				if (j + 1 < n)
				{
					if (a[i][j + 1] > a[i][j])
					{
					continue;
					}
				}
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

