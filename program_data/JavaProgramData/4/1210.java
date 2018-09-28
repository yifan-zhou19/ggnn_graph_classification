package <missing>;

public class GlobalMembers
{
	/*
	 * 14.cpp
	 *
	 *  Created on: 2013-12-7
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				//cin>>a[i][j];//????
			}
		}
	 for (s = 0;s <= row + col - 2;s++) //??????????
	 {
		 for (i = 0;i < row;i++)
		 {
		 if (s - i < col && s - i >= 0)
		 {
			 System.out.print((*(a + i) + s - i));
			 System.out.print("\n");
			// cout<<a[i][s-i]<<endl;
		 }
		 }

	 }
	  return 0;
	}
	/*??????????????????*/

}

