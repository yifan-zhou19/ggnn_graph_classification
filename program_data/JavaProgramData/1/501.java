package <missing>;

public class GlobalMembers
{
	/*
	 * fenjie.cpp
	 *
	 *  Created on: 2010-11-28
	 *      Author: ???
	 *      function: ????
	 */
	public static int solutionNumber(int a,int k)
	{ //??????????????
		int i;
		if (a == 1)
		{
			return 1;
		}
		if (k > a)
		{
			return 0;
		}
		for (i = k;i <= a;i++)
		{
			if (a % i == 0)
			{
				return solutionNumber(a, i + 1) + solutionNumber(a / i, i);
			}
		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(solutionNumber(a[i], 2));
			System.out.print("\n");
		}
		return 0;
	}



}

