package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y1;j++)
			{
				for (k = 0;k < y;k++)
				{
					c[i][j] = a[i][k] * b[k][j] + c[i][j];
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y1 - 1;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(' ');
			}
			System.out.print(c[i][y1 - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

