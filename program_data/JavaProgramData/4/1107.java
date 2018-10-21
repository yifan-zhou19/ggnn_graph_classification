package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[111][111];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[111];
		int[] p = new int[111];

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i < row;i++)
		{
		p[i] = (a + i);
		}

		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}

		for (int i = 0;i < row + col - 1;i++)
		{
			for (int j = i;j >= 0;j--)
			{
				if (j >= col != 0 || i - j >= row)
				{
					continue;
				}
				if (j < col && i - j < row)
				{
					System.out.print((p[i - j] + j));
					System.out.print("\n");
				}
			}
		}


		return 0;
	}

}

