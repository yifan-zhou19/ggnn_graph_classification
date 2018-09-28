package <missing>;

public class GlobalMembers
{
	/*
	 * zz2.cpp
	 * function:??????????
	 * Created on: 2012-12-12
	 * Author: sear
	 */
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int j;
		int k;
		//row,col??????????,a[100][100]????,j,k?????
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < row; k++)
		{
			for (j = 0; j < col; j++)
			{
				a[k][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0; k < col; k++)
		{
			for (j = k; j >= 0; j--)
			{
				if ((k - j >= 0) && (k - j) < row)
				{
					System.out.print((a[k - j] + j));
					System.out.print("\n");
				}
				//?????????????
				else
				{
					break; //????????
				}
			}
		}
		for (k = 1; k < row; k++)
		{
			for (j = col - 1;j >= 0; j--)
			{
				if ((k + col - 1 - j) < row)
				{
					System.out.print((a[k + col - 1 - j] + j));
					System.out.print("\n");
				}
				//??????????????
				else
				{
					break; //????????
				}
			}
		}
		return 0;
	}

}

