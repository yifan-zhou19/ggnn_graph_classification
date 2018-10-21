package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   1.cpp                             *
	 *@author ??                              *
	 *@date   2013-12-07                        *
	 *@description                              *
	 *??????11??????                *
	 ********************************************
	 */
	public static int n;
	public static int k;
	public static int go(int a, int step)
	{
		if (step == n)
		{
			return a;
		}
		if (a % (n - 1) == 0)
		{
			return go(a * n / (n - 1) + k, step + 1);
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = n + k; ; j += n)
		{
			if (go(j, 1) != 0)
			{
				System.out.print(go(j, 1));
				break;
			}
		}
		return 0;
	}

}

