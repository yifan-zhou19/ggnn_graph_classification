package <missing>;

public class GlobalMembers
{
	 /* homework2.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: Lixurong
	 */


	public static int gcd(int m, int n)
	{
		if (n > m)
		{
			return gcd(m, n / 2);
		}
		else if (m > n)
		{
			return gcd(m / 2, n);
		}
		else
		{
			return m;
		}
	}

	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(gcd(x, y));
		return 0;
	}

}

