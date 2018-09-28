package <missing>;

public class GlobalMembers
{
	public static final int maxn = 100;

	public static int Main()
	{
		int line;
		int row;
		int[][] num = new int[maxn][maxn];
		line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int nowline;
		int nowrow;
		int step;
		int i;
		int j;
		for (i = 0; i != line; i++)
		{
			for (j = 0; j != row; j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (step = 0; step != line + row - 1; step++)
		{
			nowline = (step >= row != 0? step - row + 1 : 0);
			nowrow = (step >= row != 0? row - 1 : step);
			while (nowline != line && nowrow != -1)
			{
				System.out.print(num[nowline][nowrow]);
				System.out.print("\n");
				nowline++;
				nowrow--;
			}
		}
		return 0;

	}
}

