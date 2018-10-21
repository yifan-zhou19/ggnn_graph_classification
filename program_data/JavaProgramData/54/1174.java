package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-11-12
	 *      Author: 7
	 */
	public static int apple(int n,int k,int a)
	{
		if (a % (n - 1) == 0)
		{
		return a = a / (n - 1) * n + k;
		}
		else
		{
			return -1;
		}
	}

	public static int Main()
	{
		int n;
		int k;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;;i++)
		{
			a = i;
			for (int j = 0;j < n;j++)
			{
				a = apple(n, k, a);
			if (a == -1)
			{
				break;
			}
			}
			if (a == -1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.print(a);
	}

}

