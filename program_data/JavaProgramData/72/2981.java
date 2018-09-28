package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[21][21];
		int[][] b = new int[500][2];
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					b[k][0] = i;
					b[k][1] = j;
					k++;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print(b[i][0] - 1);
			System.out.print(" ");
			System.out.print(b[i][1] - 1);
			System.out.print('\n');
		}
		return 0;
	}
}

