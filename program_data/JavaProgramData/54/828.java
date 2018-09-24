package <missing>;

public class GlobalMembers
{
	/*
	 * pr9.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: Gan Hua
	 */
	public static int Main()
	{
		int n; //????n?????k,????m
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int flag = 1;
		for (i = 1;flag == 1;i++)
		{
			m = n * i + k; //??????????????
		for (j = 1;j <= n - 1;j++)
		{
			if (m % (n - 1) == 0)
			{
				m = m * n / (n - 1) + k; //????????????
			}
			else
			{
				break;
			}
		}
		if (j == n)
		{
				System.out.print(m);
				flag = 0;
		}
		}
	}


}

