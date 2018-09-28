package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (y1 != x2)
		{
			System.out.print("Input error");
			return 0;
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				int sum = 0;
				for (int k = 0; k < y1; k++)
				{
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2 - 1; j++)
			{
				System.out.print(c[i][j]);
				System.out.print(' ');
			}
			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

