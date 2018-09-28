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
	public static int f;
	/*int go(int a, int step)
	{
		if (step == n)
			return a;
		if (a % (n - 1) != 0)
			return 0;
		return go(a * n / (n - 1) + k, step + 1);
	}*/
	public static void go(int a, int step)
	{
		if (step == n)
		{
				System.out.print(a);
				f = 1;
				return;
		}
		if (a % (n - 1) != 0)
		{
			return;
		}
		go(a * n / (n - 1) + k, step + 1);
	}
	public static int Main()
	{
		int j;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = n + k,f = 0;f == 0 ; j += n)
		{
	go(j, 1);
		}
		return 0;
	}

}

