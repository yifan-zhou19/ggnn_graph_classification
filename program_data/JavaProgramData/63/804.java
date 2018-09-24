package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int p;
		int q;
		int x1;
		int y1;
		int x2;
		int y2;
		int k;
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
		for (m = 0;m < x2;m++)
		{
			for (n = 0;n < y2;n++)
			{
				b[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (p = 0;p < x1;p++)
		{
			for (q = 0;q < y2;q++)
			{
				for (k = 0;k < y1;k++)
				{
					c[p][q] = a[p][k] * b[k][q] + c[p][q];
				}
			}
		}
		for (p = 0;p < x1;p++)
		{
			for (q = 0;q < y2;q++)
			{
				if (q != y2 - 1)
				{
					System.out.print(c[p][q]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[p][q]);
				}

			}
			System.out.print("\n");
		}
		return 0;
	}

}

