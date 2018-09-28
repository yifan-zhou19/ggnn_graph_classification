package <missing>;

public class GlobalMembers
{
	// ??5.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		int i = 0;
		int k = 0;
		int t = 0;
		int j = 0;

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= x1;i++)
		{
			for (t = 1;t <= y1;t++)
			{
				a[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= x2;i++)
		{
			for (t = 1;t <= y2;t++)
			{
				b[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				for (k = 0;k <= y1;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				if (j != y2)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}


			return 0;
	}



}

