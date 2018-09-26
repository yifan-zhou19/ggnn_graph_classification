package <missing>;

public class GlobalMembers
{
	//****************************************************
	// file: 4.cpp
	// description: ????
	// author? ?? 1200012858
	// date? 2012-11-8
	//****************************************************
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int m;
		int n;
		int t;
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
		for (m = 0; m < x2; m++)
		{
			for (n = 0; n < y2; n++)
			{
				b[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				for (t = 0; t < x2; t++)
				{
					c[i][j] = c[i][j] + a[i][t] * b[t][j];
				}
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2 - 1; j++)
			{
				 System.out.print(c[i][j]);
				 System.out.print(" ");
			}
			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

