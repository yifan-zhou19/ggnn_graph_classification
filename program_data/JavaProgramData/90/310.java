package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012766_fangpingguo.cpp
	 *??:?????
	 *  Created on: 2010-12-3
	 *      Author: 10154
	 */

	public static int kcs(int m,int n)
	{
		int cs = new int(int m,int n);
		if (n == 2)
		{
			return 1;
		}
		if (n >= 3)
		{
			return cs(m, n - 1);
		}
		return 0;
	}
	public static int bkcs(int m,int n)
	{
		int cs = new int(int m,int n);
		if (m == n)
		{
			return 1;
		}
		if (m > n)
		{
			return cs(m - n, n);
		}
		return 0;
	}
	public static int cs(int m,int n)
	{
		return kcs(m, n) + bkcs(m, n);
	}
	public static int Main()
	{
		int x;
		int m;
		int n;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= x;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(cs(m, n));
			System.out.print("\n");
		}
	return 0;
	}

}

