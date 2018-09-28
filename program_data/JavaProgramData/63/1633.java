package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < x2;k++)
		{
			for (int l = 0;l < y2;l++)
			{
				b[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int p = 0;p < x1;p++)
		{
			for (int q = 0;q < y2;q++)
			{
				c[p][q] = 0;
				for (int o = 0;o < y1;o++)
				{
					c[p][q] += a[p][o] * b[o][q];
				}
			}
		}
		for (int u = 0;u < x1;u++)
		{
			for (int m = 0;m < y2 - 1;m++)
			{
				System.out.print(c[u][m]);
				System.out.print(" ");
			}
			System.out.print(c[u][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}


}

