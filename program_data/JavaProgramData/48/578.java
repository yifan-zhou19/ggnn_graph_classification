package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static void f(int x,int y)
	{
		int i;
		int j;
		for (i = x - 1;i <= x + 1;i++)
		{
			for (j = y - 1;j <= y + 1;j++)
			{
			b[i][j] += a[x][y];
			}
		}
	}
	public static int Main()
	{
		int day;
		int i;
		int k;
		int j;
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
			a[i][j] = 0;
			b[i][j] = 0;
			}
		}
		a[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 1;k <= day;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					f(i, j);
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				a[i][j] += b[i][j];
				b[i][j] = 0;
				}
			}
		}
		for (i = 1;i <= 9;i++)
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

