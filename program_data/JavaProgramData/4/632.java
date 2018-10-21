package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] data = new int[row][col];
		int[] p = data;
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		int m;
		int n;
		for (i = 0;i < col;i++)
		{
			for (m = 0, n = i - m;(m < row && n >= 0);m++, n--)
			{
			System.out.print((p[m] + n));
			System.out.print("\n");
			}
		}
		for (i = 1;i < row;i++)
		{
			for (m = i, n = col - 1;(m < row && n >= 0);m++, n--)
			{
			System.out.print((p[m] + n));
			System.out.print("\n");
			}
		}
		return 0;
	}
}

