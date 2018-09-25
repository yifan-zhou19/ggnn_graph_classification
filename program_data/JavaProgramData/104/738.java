package <missing>;

public class GlobalMembers
{
	/*
	 * pr8.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: Gan Hua
	 */
	public static int Main()
	{
		int x;
		int y;
		int i = 1;
		int min;
		int max;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		min = x;
		max = y;
		if (y < x)
		{
				min = y;
				max = x;
		}
		for (min = min;min > 0;min = min / 2)
		{
			if (i != 0)
			{
			for (max = max;max >= min;max = max / 2)
			{
				if (max == min)
				{
						System.out.print(max);
						i = 0;
				}
			}
			}
		}
	}


}

