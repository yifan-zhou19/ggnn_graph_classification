package <missing>;

public class GlobalMembers
{
	/*
	 * 1062.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: sony
	 */

	public static int route(int x,int y)
	{ //??????,????????????,???????????????
		if (x == y)
		{
			return x;
		}
		if (x > y)
		{
			return route(x / 2, y);
		}
		if (x < y)
		{
			return route(x, y / 2);
		}
		else
		{
			return route(x / 2, y / 2);
		}
	}


	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(route(x, y));
		System.out.print("\n");
		return 0;
	}

}

