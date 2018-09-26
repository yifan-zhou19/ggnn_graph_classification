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
		for (int i = 0;i != m;i++)
		{
			for (int j = 0;j != n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i != n;i++)
		{
			for (int j = 0;;j++)
			{
				if (j == m || i - j < 0)
				{
					break;
				}
				System.out.print(a[j][i - j]);
				System.out.print("\n");
			}
		}
		for (int i = 1;i != m;i++)
		{
			for (int j = 0;;j++)
			{
				if (i + j == m || n - 1 - j < 0)
				{
					break;
				}
				System.out.print(a[i + j][n - 1 - j]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

