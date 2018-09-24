package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < m + n; i++)
		{
			int j = 0;
			while (j <= i)
			{
				if (j < m && i - j < n)
				{
					System.out.print(a[j][i - j]);
					System.out.print("\n");
				}
				j++;
			}
		}
	}
}

