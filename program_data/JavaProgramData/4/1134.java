package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[101][101];
		int[] p = 0;
		p = array;
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int k = 0;k < row + col - 1;k++)
		{
			for (int i = 0;i < row;i++)
			{
				for (int j = 0;j < col;j++)
				{
					if (i + j == k)
					{
						System.out.print((p[i] + j));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

