package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[60][60];
		int m;
		int n;
		int i;
		int j;
		int i1;
		int j1;
		int[][] b = new int[60][60];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i1 = 1;i1 <= m;i1++)
		{
			for (j1 = 1;j1 <= n;j1++)
			{
				if (a[i1][j1] >= a[i1][j1 - 1] != 0 && a[i1][j1] >= a[i1][j1 + 1] != 0 && a[i1][j1] >= a[i1 - 1][j1] != 0 && a[i1][j1] >= a[i1 + 1][j1])
				{
					b[i1][j1] = 1;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (b[i][j] == 1)
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

