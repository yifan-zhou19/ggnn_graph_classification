package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2013-10-11
	 *      Author: ??
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int sj;
		int hc;
		int q1;
		for (int i = 1;i <= n;i++)
		{
			q1 = 1;
			sj = 1;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 3;j <= a;j++)
			{
				hc = sj;
				sj = sj + q1;
				q1 = hc;
			}
			System.out.print(sj);
			System.out.print("\n");
		}
		return 0;
	}

}

