package <missing>;

public class GlobalMembers
{
	/*
	 * 183.cpp
	 *
	 *  Created on: 2011-11-20
	 *      Author: think
	 */
	public static int way1(int m, int n)
	{ //????????????
		int r;
		r = m % n;
		if (n == 1)
		{
			return 1; //??
		}
		if (m == 0 || m < n)
		{
			return 0; //??
		}
		if (m == n)
		{
			return 1; //??
		}
		return way(m - n, n); //??
	}
	public static int way2(int m, int n)
	{ //??????????
		if (n == 1)
		{
			return 0; //??
		}
		else
		{
			return way(m, n - 1); //??
		}
	}
	public static int way(int m,int n)
	{ //????????
		return way1(m, n) + way2(m, n);
	}
	public static int Main()
	{ //?????
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[k + 1];
		int[] b = new int[k + 1];
		for (i = 1;i <= k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= k;i++)
		{
			System.out.print(way(a[i], b[i]));
			System.out.print("\n");
		}
		return 0;
	} //?????

}

