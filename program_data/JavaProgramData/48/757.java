package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11]; //??????????????????????????????
		int[][] b = new int[11][11];
		int n;
		int m;
		int i;
		int k;
		int j;
		int l;
		int x;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 11;i++) //???
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
		b[5][5] = m;
		for (x = 1;x <= n;x++) //??n????????????
		{
			for (i = 0;i < 11;i++)
			{
				for (j = 0;j < 11;j++)
				{
					a[i][j] = 0;
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					a[i][j] = 2 * b[i][j] + b[i - 1][j - 1] + b[i - 1][j] + b[i - 1][j + 1] + b[i][j - 1] + b[i][j + 1] + b[i + 1][j - 1] + b[i + 1][j] + b[i + 1][j + 1];
				}
			}
			for (i = 0;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					b[i][j] = a[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

