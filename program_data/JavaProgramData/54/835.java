package <missing>;

public class GlobalMembers
{
	/*
	 * T.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: dell
	 */
	public static int Main()
	{
		int n;
		int m;
		int k;
		int m1;
		int i;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n + k;
		while (true)
		{
			count = 0;
			m1 = m;
			for (i = 1;i <= n;i++)
			{
				m1 = m1 - k;
				if ((m1 % n == 0) && (m1 != 0))
				{
					count++;
					m1 = m1 * (n - 1) / n;
					continue;
				}
				break;
			}
			if (count == n)
			{
				System.out.print(m);
				System.out.print("\n");
				break;
			}
			m += n;
		}
		return 0;
	}

}

