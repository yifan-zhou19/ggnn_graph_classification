package <missing>;

public class GlobalMembers
{
	/*
	 *????Ex6_4.cpp
	 *??????
	 *?????2012-12-10
	 *?????????????
	 */



	public static int Main()
	{
		int n; // p?????
		int m = 0;
		int k = 0;
		int i;
		int j;
		int x;
		int y;
		int row;
		int col;
		int[][] a = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = row * col;
		for (i = 0;i < row;i++)
		{
			p = (int)a + i * 100;
			for (j = 0;j < col;j++)
			{
				*p++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0,j = 0;m < n;i = x,j = y)
		{
			m++; // ??????
			p = (int)a + i * 100 + j; // ????
			System.out.print(p);
			System.out.print("\n");
			x = i + 1;
			y = j - 1; // ?????
			if (x >= row != 0 || y < 0) // ????
			{
				x = 0;
				y = ++k;
				if (y >= col) // ??????
				{
					x = y - col + 1;
					y = col - 1;
				}
			}
		}
		return 0;
	}
}

