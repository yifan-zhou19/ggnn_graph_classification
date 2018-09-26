package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int[] aa = a;
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;i < col;i++)
		{
			int r = 0;
			int c = i;
			while (r <= row - 1 && c >= 0)
			{
				System.out.print(((aa[r]) + c));
				System.out.print("\n");
				r = r + 1;
				c = c - 1;
			}
		}
		for (int i = 1;i < row;i++)
		{
			int r = i;
			int c = col - 1;
			while (r <= row - 1 && c >= 0)
			{
				System.out.print(((aa[r]) + c));
				System.out.print("\n");
				r = r + 1;
				c = c - 1;
			}
		}

		return 0;
	}
}

