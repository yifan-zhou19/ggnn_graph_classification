package <missing>;

public class GlobalMembers
{
	/*
	 * fangpingguo.cpp
	 *
	 *  Created on: 2010-12-1
	 *      Author: 378073652
	 */

	public static int s = 0;
	public static int number(int x,int y,int z,int num)
	{
		int i;

		if (x == 0 && y >= num)
		{
			s = s + 1;
		}
		if (x == 0 && y < num)
		{
			return 0;
		}
		for (i = z;i <= x;i++)
		{
			if (x - i >= 0)
			{
				number(x - i, y, i, num + 1);
			}
		}

		return s;
	}



	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(number(m, n, 1, 0));
			System.out.print("\n");

	s = 0;


		}
	}

}

