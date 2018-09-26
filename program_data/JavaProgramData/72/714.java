package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n + 2][m + 2];
		for (i = 0;i < n + 2;i++)
		{
				for (j = 0;j < m + 2;j++)
				{
					a[i][j] = 0;
				}
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < m + 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < m + 1;j++)
			{
			 if ((a[i + 1][j] <= a[i][j]) && (a[i - 1][j] <= a[i][j]) && (a[i][j + 1] <= a[i][j]) && (a[i][j - 1] <= a[i][j]))
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

