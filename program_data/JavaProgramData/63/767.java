package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int p;
		int q;
		int m = 0;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (y1 != x2)
		{
			System.out.print("error!");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < x1;i++)
			{
				for (j = 0;j < y2;j++)
				{
					c[i][j] = 0;
				}
			}
			for (i = 0;i < x1;i++)
			{
				m = 0;
				for (j = 0;j < y2;j++)
				{
					for (p = 0;p < x2;p++)
					{
						c[i][j] = c[i][j] + a[i][p] * b[p][j];
					}
				}
			}
			for (i = 0;i < x1;i++)
			{
				for (j = 0;j < y2 - 1;j++)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				System.out.print(c[i][y2 - 1]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

