package <missing>;

public class GlobalMembers
{
	/*
	 * erchasu.cpp
	 *
	 *  Created on: 2012-11-26
	 *      Author: Justin
	 */

	public static int Main()
	{
			  int x;
			  int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while (x != y)
			{
			if (x > y)
			{
				x = x / 2;
			}
			else
			{
				y = y / 2;
			}
			}
		System.out.print(x);
	}
}

