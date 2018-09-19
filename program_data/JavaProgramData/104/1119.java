package <missing>;

public class GlobalMembers
{
	/*
	 * 006.cpp
	 *
	 *  Created on: 2012-11-24
	 *      Author: asus
	 */
	public static int common(int x, int y) //??common??
	{
		if (x > y)
		{
			return common(x / 2, y); //???????????2
		}
		if (x < y)
		{
			return common(x, y / 2);
		}
		return x; //?????
	}

	public static int Main() //???
	{
		int m = 0;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(common(m, n));
		System.out.print("\n");
		return 0;
	}
}

