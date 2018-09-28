package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[][] a = new int[100][100];
		double[][] b = new double[100][200];
		for (j = 0;j < 200;j++)
		{
			for (i = 0;i < 100;i++)
			{
				b[i][j] = 0.5;
			}
		}
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				b[i][j + i] = a[i][j];
			}
		}
		for (j = 0;j < 200;j++)
		{
			for (i = 0;i < 100;i++)
			{
				if (b[i][j] != 0.5)
				{
					System.out.print(b[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

