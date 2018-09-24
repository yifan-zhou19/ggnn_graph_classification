package <missing>;

public class GlobalMembers
{
	public static int[][] area = new int[11][11];
	public static void grow(int day)
	{
		int[][] temp = new int[11][11];
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				temp[i - 1][j] += area[i][j] * 1;
				temp[i + 1][j] += area[i][j] * 1;
				temp[i][j - 1] += area[i][j] * 1;
				temp[i][j + 1] += area[i][j] * 1;
				temp[i + 1][j + 1] += area[i][j] * 1;
				temp[i - 1][j + 1] += area[i][j] * 1;
				temp[i + 1][j - 1] += area[i][j] * 1;
				temp[i - 1][j - 1] += area[i][j] * 1;
				temp[i][j] += area[i][j] * 2;
			}
		}
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				area[i][j] = temp[i][j];
			}
		}
		day -= 1;
		if (day > 0)
		{
			grow(day);
		}
	}
	public static void print()
	{
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 9;j++)
			{
				System.out.print(area[i][j]);
				System.out.print(" ");
			}
			System.out.print(area[i][9]);
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int start = 0;
		int day = 0;
		start = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		area[5][5] = start;
		grow(day);
		print();
		return 0;
	}
}

