package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */

	public static int apple(int x, int y) //x:apple, y:dish
	{
		if (x == 0)
		{
				return 1;
		}
			if (y == 1)
			{
				return 1;
			}
		if (x < y)
		{
			return apple(x, x);
		}
		else if (x >= y)
		{
			return apple(x - y, y) + apple(x, y - 1);
		}
	}


	public static int Main()
	{
		int i;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i;i > 0; i--)
		{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(apple(m, n));
		if (i != 1)
		{
			System.out.print("\n");
		}
		}
		return 0;
	}

}

