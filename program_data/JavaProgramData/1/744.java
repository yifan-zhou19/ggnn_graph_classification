package <missing>;

public class GlobalMembers
{
	/*
	 * 187.cpp
	 *
	 *  Created on: 2011-11-22
	 *      Author: think
	 */
	public static int count(int a,int n)
	{
		if (a > n)
		{
			return 0;
		}
		if (a == n)
		{
			return 1;
		}
		int p = 1;
		int i;
		for (i = a;i <= n;i++)
		{
			if (n % i == 0 && i <= n / i)
			{
				p = p + count(i, n / i);
			}
		}
		return p;
	}
	public static int geshu(int N)
	{
		int i;
		int s = 1;
		for (i = 2;i <= Math.sqrt(N);i++)
		{
			if (N % i == 0)
			{
				s = s + count(i, N / i);
			}
		}

		return s;
	}
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] c = new int[N];
		int j;
		for (j = 0;j < N;j++)
		{
			c[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < N;j++)
		{
			System.out.print(geshu(c[j]));
			System.out.print("\n");
		}
		return 0;
	}

}

