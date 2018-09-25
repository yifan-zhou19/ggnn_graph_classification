package <missing>;

public class GlobalMembers
{
	/*
	 * assignment.cpp
	 *
	 *  Created on: 2010-11-23
	 *      Author: ??
	 *      ???
	 */


	//???????
	public static int sort(int x,int y)
	{
		//????????
		if (x < y)
		{
			return sort(x, x);
		}
		if (x == 2)
		{
			return 2;
		}
		if (y == 2)
		{
			return x / 2 + 1;
		}
		if (x == 1 || y == 1)
		{
			return 1;
		}
		if (x == 0 || y == 0)
		{
			return 1;
		}
		return sort(x, y - 1) + sort(x - y, y); //???????????????????????
	}
	//???
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m;
		int n;
		for (int i = 0;i < num;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(sort(m, n));
			System.out.print("\n");
		}
		return 0;
	}

}

