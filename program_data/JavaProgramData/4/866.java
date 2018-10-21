package <missing>;

public class GlobalMembers
{
	/* 
	 * ????main.cpp
	 * ??????
	 * ?????2012-12-10
	 * ???????row?col??????array????array[0][0]?????????????????????????
	 */

	public static int Main()
	{
		int[][] array = new int[100][100]; //????array???????row,col??????????????i,j;??*p
		int row;
		int col;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(array,0,(Integer.SIZE / Byte.SIZE)); //?????
		for (i = 0; i < row; i++) //????
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < col; i++) //?????????????
		{
			for (p = array[0][i]; * p; p += 99)
			{
				System.out.print(p);
				System.out.print("\n");
			}
		}
		for (i = 1; i < row; i++) //???????????
		{
			for (p = array[i][col - 1]; * p; p += 99)
			{
				System.out.print(p);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

