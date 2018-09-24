package <missing>;

public class GlobalMembers
{
	/*
	 * assignment.cpp
	 *
	 *  Created on: 2010-11-23
	 *      Author: ??
	 *      ?? ???
	 */


	public static int Main()
	{
		int n;
		int k;
		int m = 1;
		int i;
		int m0 = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			for (i = 1; i <= n; i++)
			{
				if (m % (n - 1) == 0)
				{
					m = n * m / (n - 1) + k;
				}
				else
				{
					m0++;
					m = m0;
					i = 1;
					break;
				}
			}
			if (i == n + 1)
			{
				System.out.print(m);
				return 0;
			}
		}
	}

}

