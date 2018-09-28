package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i = 0;
		int j = 0;
		int[][] a = new int[100][100];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < y;i++)
		{
			for (j = 0;i - j >= 0 && j < x;j++)
			{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
			}
		}
		for (i = 1;i < x;i++)
		{
			for (j = 0;i + j < x && y - j - 1 >= 0;j++)
			{
				System.out.print(a[i + j][y - 1 - j]);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

