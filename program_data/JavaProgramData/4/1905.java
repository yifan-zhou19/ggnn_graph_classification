package <missing>;

public class GlobalMembers
{
	/*
	 * diag.cpp
	 *
	 *  Created on: 2013-12-6
	 *      Author: ???1300012996
	 */
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] a = new int[10010];
		int[] p = a;
		for (i = 0;i < row * col;i++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p++;
		}
		p = a;
		for (int c = 0;c < row + col;c++)
		{
			for (i = c;i >= 0;i--)
			{
				if (i < col && c - i < row)
				{
					System.out.print((p + i + (c - i) * col));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

