package <missing>;

public class GlobalMembers
{
	/*
	 * ????
	 * Created on: 2012-12-12
	 * ??
	 * Author: ???
	 */

	public static void bianli()
	{

	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int row = 0;
		int col = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = a;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		/*for (i=0;i<row;i++)
				for (j=0;j<col;j++)cout<<a[i][j]<<endl;*/
		for (i = 0;i < col;i++)
		{
			p = a + i;
			j = i + 1;
			while (j != 0)
			{
				System.out.print(p);
				System.out.print("\n");
				p = p + col - 1;
				if (j > row)
				{
					j = row - 1;
				}
				else
				{
					j--;
				}
			}
		}
		for (i = 1;i < row;i++)
		{
			p = (a + i) + col - 1;
			j = row - i;
			while (j != 0)
			{
				System.out.print(p);
				System.out.print("\n");
				p = p + col - 1;
				if (j > col)
				{
					j = col - 1;
				}
				else
				{
					j--;
				}
			}
		}
		return 0;
	}

}

