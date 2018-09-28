package <missing>;

public class GlobalMembers
{
	public static void fanzhi(int x, int y, int n)
	{
		add[x - 1][y] += n;
		add[x + 1][y] += n;
		add[x][y - 1] += n;
		add[x][y + 1] += n;
		add[x][y] += n * 2;
		add[x - 1][y - 1] += n;
		add[x - 1][y + 1] += n;
		add[x + 1][y - 1] += n;
		add[x + 1][y + 1] += n;

	}
	public static int[][] a = new int[9][9];
	public static int[][] add = new int[9][9];

	public static int Main()
	{

		int i;
		int j = 0;
		//???
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
			}
		}

		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				add[i][j] = 0;
			}
		}

		int m = 0;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		int k = 0;

		for (k = 1;k <= n;k++)
		{
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				add[i][j] = 0;
			}
		}

			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					fanzhi(i, j, a[i][j]); //??????????
				}
			}

			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = add[i][j];
				}
			}
		}


		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				System.out.print(a[i][j]);
				if (j != 8)
				{
					System.out.print(" ");
				}
				else if (i != 8)
				{
					System.out.print("\n");
				}
			}
		}




		return 0;
	}
}

