package <missing>;

public class GlobalMembers
{
	/*
	 * tree.cpp
	 *
	 *  Created on: 2011-11-9
	 *      Author: wangshiheng
	 */
	public static int Main()
	{
		int x;
		int y;
		int t;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != y) //?????????????2????????????????????????
		{
			if (x < y)
			{
				t = x;
				x = y;
				y = t;
			}
			x /= 2;
		}
		System.out.print(x);
		return 0;
	}

}

