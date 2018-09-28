package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int[] p = a;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i <= row + col - 2;i++)
		{
			if (i < col - 1)
			{
				for (j = 0;j <= row - 1 && j <= i;j++)
				{
					System.out.print((p[j] + i - j));
					System.out.print("\n");
				}
			}
			else
			{
				for (j = col - 1;i - j <= row - 1 && j >= 0;j--)
				{
					System.out.print((p[i - j] + j));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

