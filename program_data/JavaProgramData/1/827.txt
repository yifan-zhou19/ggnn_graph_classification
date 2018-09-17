package <missing>;

public class GlobalMembers
{
	/*
	 * ????@.cpp
	 *
	 *  Created on: 2011-11-27
	 *      Author: Administrator
	 */
	public static int num0; //????
	public static int factor(int x, int y) //?????
	{
		int countn = 1; //????????1
		if (x == 1)
		{
			return 0;
		}
		if (x == 2)
		{
			return 1; //??1,2?????
		}
		for (int i = y; i <= Math.sqrt(x); i++)
		{
			if (x % i == 0)
			{
				countn += factor(x / i, i); //?????
			}
		}
		return countn;
	}
	public static int Main() //?????
	{ //?????
		int n; //????
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= n; j++)
		{
			num0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(factor(num0, 2));
			System.out.print("\n");
		}
		return 0; //???????????????????
	} //????


}

