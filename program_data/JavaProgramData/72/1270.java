package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[25][25];
		for (int i = 1;i < m + 1;i++)
		{
				for (int j = 1;j < n + 1;j++)
				{
						a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (int i = 1;i < m + 1;i++)
		{
				a[i][0] = a[i][1];
				a[i][n + 1] = a[i][n];
		}
		for (int j = 1;j < n + 1;j++)
		{
				a[0][j] = a[1][j];
				a[m + 1][j] = a[m][j];
		}
		for (int i = 1;i < m + 1;i++)
		{
				for (int j = 1;j < n + 1;j++)
				{
						if (a[i][j - 1] <= a[i][j] != 0 && a[i - 1][j] <= a[i][j] != 0 && a[i][j + 1] <= a[i][j] != 0 && a[i + 1][j] <= a[i][j])
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

