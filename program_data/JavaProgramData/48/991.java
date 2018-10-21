package <missing>;

public class GlobalMembers
{
	//????

	public static int[][] chess = new int[15][15];
	public static int d;

	public static int f(int i,int j,int k)
	{
		if (i < 1 || i>9 || j < 1 || j>9)
		{
			return 0;
		}
		if (k == 0)
		{
			return chess[i][j];
		}
		return f(i, j, k - 1) * 2 + f(i, j - 1, k - 1) + f(i, j + 1, k - 1) + f(i + 1, j, k - 1) + f(i - 1, j, k - 1) + f(i - 1, j - 1, k - 1) + f(i - 1, j + 1, k - 1) + f(i + 1, j - 1, k - 1) + f(i + 1, j + 1, k - 1);
	}

	public static int Main()
	{
		chess[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;

		for (i = 1;i <= 9;i++)
		{
			System.out.print(f(i, 1, d));
			for (j = 2;j <= 9;j++)
			{
				System.out.print(" ");
				System.out.print(f(i, j, d));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

