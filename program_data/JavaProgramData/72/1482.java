package <missing>;

public class GlobalMembers
{
	public static final int[][] fx =
	{
		{0, 1},
		{0, -1},
		{1, 0},
		{-1, 0}
	};
	public static int[][] w = new int[30][30];
	public static int chk(int x,int y)
	{
		for (int i = 0;i < 4;i++)
		{
			if (w[x][y] < w[x + fx[i][0]][y + fx[i][1]])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(w,-32768,(Integer.SIZE / Byte.SIZE));
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				w[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
			if (chk(i, j) != 0)
			{
				System.out.print(i - 1);
				System.out.print(' ');
				System.out.print(j - 1);
				System.out.print("\n");
			}
			}
		}

		return 0;
	}

}

