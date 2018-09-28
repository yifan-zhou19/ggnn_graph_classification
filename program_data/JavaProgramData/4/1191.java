package <missing>;

public class GlobalMembers
{
	/*??
	 ????row?col??????array????array[0][0]?????????????????????????
	 ????
	 ????????????????row?col?
	 ???row??????col???????????????
	 ??????row?col??0<row<100, 0<col<100?
	 ????
	 ????????????????????
	 ????
	 3 4
	 1 2  4  7
	 3 5  8 10
	 6 9 11 12
	 ????
	 1
	 2
	 3
	 4
	 5
	 6
	 7
	 8
	 9
	 10
	 11
	 12
	 */
	public static int Main()
	{
		int row = 0;
		int col = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'0',(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] p = a;
		for (int i = 0;i < row + col - 1;i++)
		{
			if (i < col)
			{
				for (int j = 0;j <= row;j++)
				{
					if (i - j < col && j < row && j >= 0 && i - j >= 0)
					{
						System.out.print((p[j] + i - j));
						System.out.print("\n");
					}
				}
			}
			else
			{
				for (int j = 1;j < row;j++)
				{
					if (i - j < col && j < row && i - j >= 0 && j >= 0)
					{
						System.out.print((p[j] + i - j));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

