package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		int[][] a = new int[22][22];
		int[] b = new int[400];
		int[] c = new int[400];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= m + 1;i++)
		{
			a[i][0] = 0;
			a[i][n + 1] = 0;
		}
		for (i = 0;i <= n + 1;i++)
		{
			a[0][i] = 0;
			a[m + 1][i] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					b[k] = i - 1;
					c[k] = j - 1;
					k++;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
			System.out.print(c[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

