package <missing>;

public class GlobalMembers
{
	/*
	 * trees.cpp
	 *
	 *  Created on: 2012-11-17
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int x = 0;
		int y = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double row1 = 0;
		double row2 = 0;
		row1 = Math.ceil(log2((double)(x + 1)));
		row2 = Math.ceil(log2((double)(y + 1)));
		while (row2 > row1)
		{
			y = y / 2;
			row2 = Math.ceil(log2((double)(y + 1)));
		}
		while (row1 > row2)
		{
				x = x / 2;
				row1 = Math.ceil(log2((double)(x + 1)));
		}
		while (x != y)
		{
			x = x / 2;
			y = y / 2;
		}
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}

}

