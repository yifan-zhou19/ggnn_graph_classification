package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-10
	 *      Author: 1100012870
	 */

	public static int n; //n?k??????
	public static int k;

	public static int ping(int no,int num)
	{
		if (no == 0)
		{
			System.out.print(num);
			System.out.print("\n");
			return 1;
		}
		int x;
		x = num * n;
		if (x % (n - 1) != 0)
		{
			return 0; //??????????
		}
		return ping(no - 1, x / (n - 1) + k); //??????????????
	}

	public static int Main()
	{
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{ //???????????????
			if (ping(n, i) == 1)
			{
				break; //??????????
			}
			i++;
		}
		return 0;
	}

}

