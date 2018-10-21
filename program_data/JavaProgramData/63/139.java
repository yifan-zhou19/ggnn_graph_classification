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
		int[][] ju1 = new int[101][101];
		int[][] ju2 = new int[101][101];
		int[][] ans = new int[101][101];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				ju1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				ju2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				for (k = 0; k < y1; k++)
				{
					ans[i][j] = ans[i][j] + ju1[i][k] * ju2[k][j];
				}
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				if (j == y2 - 1)
				{
					System.out.print(ans[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(ans[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}

}

