package <missing>;

public class GlobalMembers
{
	/*
	 * 12.10.11a.cpp
	 *  Created on: 2012-10-11
	 *      Author: ???
	 *      ???????????
	 */
	public static int p(int x)
	{
		int i = 2;
	while (true)
	{
		if (i == (x - 1))
		{
			return (1);
			break;
		}
		else if (x % i == 0)
		{
			return (2);
			break;
		}
		i = i + 1;
	}
	}
	public static int Main()
	{
		int n;
		int m;
		int a;
		int k = 3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		while (n-- != 0)
		{
			a = m - k;
			if (k > (m / 2))
			{
				break;
			}
		if (p(k) == 1 && p(a) == 1)
		{
			System.out.print(k);
			System.out.print(' ');
			System.out.print(a);
			System.out.print("\n");
		}
		k = k + 2;
		}
	return 0;
	}
}

