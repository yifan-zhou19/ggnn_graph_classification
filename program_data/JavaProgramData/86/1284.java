package <missing>;

public class GlobalMembers
{
	/*
	 * tiaosheng.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: 11161
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1;j <= n;j++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			int times;
			int sum1 = 0;
			int sum2 = 0;
			int w = 0;
			int i = 1;
			for (;i <= m;i++)
			{
				times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum1 = 3 * (i - 1) + times;
				sum2 = times;
				if (sum1 > 57)
				{
				if (sum1 > 60)
				{
					System.out.print(60 - (i - 1) * 3);
					System.out.print("\n");
				}
				else
				{
					System.out.print(times);
					System.out.print("\n");
				}
				w = 1;
				break;
				} //sum1=sum1+3;
			}
			if (w == 0)
			{
				if (times > 57)
				{
					System.out.print(times);
					System.out.print("\n");
				}
			else
			{
				System.out.print(60 - m * 3);
				System.out.print("\n");
			}
			}
			else
			{
				for (int j = i + 1;j <= m;j++)
				{
					times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}

			}
		}
		return 0;
	}
}

