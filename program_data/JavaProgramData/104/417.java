package <missing>;

public class GlobalMembers
{
	/*
	 * 1000062703.cpp
	 *
	 *  Created on: 2010-11-12
	 *      Author: Administrator
	 */
	public static int cha(int a,int b)
	{
		if (a > b)
		{
			return (cha(a / 2, b));
		}
		if (a < b)
		{
			return (cha(a, b / 2));
		}
		if (a == b)
		{
			return a;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(cha(x, y));
		System.out.print("\n");
		return 0;
	}

}

