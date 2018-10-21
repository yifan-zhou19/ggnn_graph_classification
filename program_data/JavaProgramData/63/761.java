package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
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
		int[][] c = new int[100][100];
		int p;
		int q;
		for (p = 0;p < x1;p++)
		{
			for (q = 0;q < y2;q++)
			{
			for (i = 0;i < y1;i++)
			{
					c[p][q] += a[p][i] * b[i][q];
			}
			}
		}

		for (p = 0;p < x1;p++)
		{
			for (q = 0;q < y2 - 1;q++)
			{
				System.out.print(c[p][q]);
				System.out.print(" ");
			}
			System.out.print(c[p][y2 - 1]);
			System.out.print("\n");
		}




	return 0;
	}

}

