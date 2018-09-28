package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 11;i++)
			{
				for (j = 0;j < 11;j++)
				{
					b[i][j] = a[i][j];
				}
			}
			for (i = 1;i < 11;i++)
			{
				for (j = 1;j < 11;j++)
				{
					a[i][j] = b[i][j] * 2 + b[i][j - 1] + b[i][j + 1] + b[i + 1][j] + b[i - 1][j] + b[i + 1][j + 1] + b[i + 1][j - 1] + b[i - 1][j + 1] + b[i - 1][j - 1];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				if (j != 1)
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(a[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

