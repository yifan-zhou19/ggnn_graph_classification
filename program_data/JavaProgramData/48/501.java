package <missing>;

public class GlobalMembers
{
	public static int[][] pymbg = new int[11][11];
	public static int[][] pymed = new int[11][11];
	public static void peiyang(int n)
	{
		int i;
		int j;
		if (n != 0)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
				pymed[i][j] = pymed[i][j] + pymbg[i][j];
				pymed[i][j - 1] = pymed[i][j - 1] + pymbg[i][j];
				pymed[i][j + 1] = pymed[i][j + 1] + pymbg[i][j];
				pymed[i + 1][j] = pymed[i + 1][j] + pymbg[i][j];
				pymed[i + 1][j - 1] = pymed[i + 1][j - 1] + pymbg[i][j];
				pymed[i + 1][j + 1] = pymed[i + 1][j + 1] + pymbg[i][j];
				pymed[i - 1][j] = pymed[i - 1][j] + pymbg[i][j];
				pymed[i - 1][j - 1] = pymed[i - 1][j - 1] + pymbg[i][j];
				pymed[i - 1][j + 1] = pymed[i - 1][j + 1] + pymbg[i][j];
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					pymbg[i][j] = pymed[i][j];
				}
			}
			n--;
			peiyang(n);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pymbg[5][5] = m;
		pymed[5][5] = m;
		peiyang(n);
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.print(pymbg[i][j]);
				System.out.print(' ');
			}
			System.out.print(pymbg[i][9]);
			System.out.print('\n');
		}
		return 0;
	}
}

