package <missing>;

public class GlobalMembers
{
	/*
	 * ???
	 *
	 *  Created on: 2012-11-24
	 *      Author: zhuyongfu
	 */


	public static int binary(int m,int n)
	{ //??????????
		if (m == n) //???????????????
		{
			return m;
		}
		if (m < n / 2 + 1) //???????????????????
		{
			return binary(m, n / 2);
		}
		if (n < m / 2 + 1)
		{
			return binary(m / 2, n);
		}
		else //??????????????
		{
			return binary(m / 2, n / 2);
		}
		return 0;
	}

	public static int Main()
	{
		int x; //?????????
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(binary(x, y));
		System.out.print("\n");
		return 0;
	}

}

