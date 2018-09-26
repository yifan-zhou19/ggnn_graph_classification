package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		int i = 0;
		int j = 0;
		int h = 0;
		int sum = 0;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] o = new int[101][101];
		int[][] x = new int[101][101];
		int[][] r = new int[101][101];
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= x2;j++)
			{
				o[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= y1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				sum = 0;
				for (h = 1;h <= x2;h++)
				{
					sum = o[i][h] * x[h][j] + sum;
				}
				r[i][j] = sum;
			}
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				if (j == y2)
				{
				  System.out.print(r[i][j]);
				}
				else
				{
				  System.out.print(r[i][j]);
				  System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

