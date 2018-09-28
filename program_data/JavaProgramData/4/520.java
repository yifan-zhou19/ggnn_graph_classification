package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < m + n - 1;k++)
		{
			for (i = n - 1;i >= 0;i--)
			{
				if (k - i >= 0 && k - i < m)
				{
					System.out.print(a[k - i][i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

