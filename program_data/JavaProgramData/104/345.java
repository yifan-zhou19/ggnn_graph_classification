package <missing>;

public class GlobalMembers
{
	/*
	 * erchashudigui.cpp
	 *
	 *  Created on: 2010-11-26
	 *      Author: 378073652
	 */

	public static int s = 0;

	public static int common(int x,int y,int s)
	{
		if (x == y)
		{
			return x;
		}
		if (x > y)
		{
			s++;
			return common(x / 2, y, s);
		}
		if (x < y)
		{
			s++;
			return common(x, y / 2, s);
		}
	}
	public static int Main()
	{
		int a;
		int b;

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(common(a, b, s));
		System.out.print("\n");

	}

}

