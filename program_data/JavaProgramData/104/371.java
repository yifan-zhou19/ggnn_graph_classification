package <missing>;

public class GlobalMembers
{
	/*
	 * assignment.cpp
	 *
	 *  Created on: 2010-11-23
	 *      Author: ??
	 *      ???????
	 */


	public static int Main()
	{
		int x;
		int y;
		int i = 0;
		int j = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (Math.pow(2,i) > x)
			{
				break;
			}
			i++;
		}
		while (true)
		{
			if (Math.pow(2,j) > y)
			{
				break;
			}
			j++;
		}
		while (i > j)
		{
			x = x / 2;
			i--;
		}
		while (i < j)
		{
			y = y / 2;
			j--;
		}
		while (true)
		{
			if (x == y)
			{
				break;
			}
			else
			{
				x = x / 2;
				y = y / 2;
			}
		}
		System.out.print(x);
		return 0;
	}

}

