package <missing>;

public class GlobalMembers
{
	/*
	 * ????array.cpp
	 * ????: 2012-12-11
	 * ??: winneshaw
	 * ???????row?col??????array
	 * ???array[0][0]?????????????????????????
	 */


	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		int j;
		int i;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		for (j = 0;j < row;j++)
		{
		p = array[j];
		for (i = 0;i < col;i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
		}
		}
		p = array[0];
		for (k = 0;k <= row + col - 2;k++)
		{
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
		 if (i + j == k)
		 {
				System.out.print((p + i * col + j));
				System.out.print("\n");
		 }
			}
		}
		}
		return 0;
	}

}

