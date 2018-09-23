package <missing>;

public class GlobalMembers
{
	/*
	 *  1000012850_34.1.cpp
	 *  ????????????a??????????????? ?????????
	 *  Created on: 2010-11-27
	 *      Author: william
	 */
	public static int resolution_into_factors(int j,int i)
	{
		int m;
		int sum = 0;
		int k = 0;
		for (m = j ;m <= Math.sqrt(i); m++)
		{
			if (i % m == 0)
			{
				sum = resolution_into_factors(m, i / m) + sum + 1;
				k++;
			}
		}
		if (k == 0)
		{
			return 0;
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(resolution_into_factors(2, i) + 1);
			System.out.print("\n");
		}
		return 0;
	}
}

