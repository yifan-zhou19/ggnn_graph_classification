package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-12-1
	 *      Author: hanzhe
	 */


	public static int min(int a,int b)
	{ //????
		if (a > b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int f(int n,int s)
	{ //???????s?n???????
		int k = 0;
		int i;
		if (n == 1)
		{
			return 1;
		}
		else if (s == 1)
		{
			return 0;
		}
		else if (s > n)
		{
			return f(n, n);
		}
		else
		{
			for (i = 2;i <= s;i++)
			{
			if (n % i == 0)
			{
				k = k + f(n / i, min(i, s));
			}
			}
		return k;
		}
	}
	public static int Main()
	{ //????
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, m));
			System.out.print("\n");
			n--;
		}
		return 0;
	} //????

}

