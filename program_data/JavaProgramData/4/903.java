package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[105][105];
		int row;
		int col;
		(int)(*p)[105];
		p = array;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
		for (int j = 0;j < col;j++)
		{
			*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
		}
		}
		int i;
		int j;
		int m = 0;
		while (true)
		{
			if (m < col)
			{
				for (i = 0, j = m;j >= 0 && i <= row - 1;i++, j--)
				{
					 System.out.print((*(p + i) + j));
					 System.out.print("\n");
				}
			}
			else
			{
				for (i = m - col + 1, j = col - 1;i <= row - 1 && j >= 0;i++, j--)
				{
					 System.out.print((*(p + i) + j));
					 System.out.print("\n");
				}
			}
			m++;
			if (m == row + col)
			{
				break;
			}
		}

		return 0;
	}

}

