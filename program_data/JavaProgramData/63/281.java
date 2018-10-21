package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int[][] a = new int[1000][1000];
		int[][] b = new int[1000][1000];
		int[][] c = new int[1000][1000];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x2;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 1;k <= y2;k++)
		{
			for (i = 1;i <= x1;i++)
			{
				for (j = 1;j <= y1;j++)
				{
					c[i][k] = c[i][k] + a[i][j] * b[j][k];
				}
			}
		}
		for (i = 1;i <= x1;i++)
		{
			System.out.print(c[i][1]);
			for (k = 2;k <= y2;k++)
			{
				System.out.print(" ");
				System.out.print(c[i][k]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

