package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *??????????
	 *  Created on: 2011-10-30
	 *      Author: ??
	 */
	public static int Main()
	{
		int col; //col?? row?? i?k?l????????
		int row;
		int i;
		int k;
		int l;
		int max;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (row > col) //??????????
		{
			max = row;
		}
		else
		{
			max = col;
		}
		int[][] a = new int[max][max]; //????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE)); //???????????
		for (i = 0;i < row;i++)
		{
			for (k = 0;k < col;k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < max * 2 - 1;i++)
		{
			if (i < max)
			{ //??????????????????????????
				for (k = 0, l = i - k;k < max && l >= 0;k++, l--)
				{
					if (a[k][l] != 0) //??????????????
					{
						System.out.print(a[k][l]);
						System.out.print("\n");
					}
				}
			}
			else //????????????
			{
				for (k = max - 1, l = i - k;k > 0 && l < max;k--, l++)
				{
					if (a[l][k] != 0)
					{
						System.out.print(a[l][k]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

