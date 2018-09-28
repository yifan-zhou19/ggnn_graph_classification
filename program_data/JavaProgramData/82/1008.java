package <missing>;

public class GlobalMembers
{
	/*
	 * NormalBloodPressure.cpp
	 *
	 *  Created on: 2012-10-16
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int[] sys = new int[100];
		int[] dias = new int[100];
		int[] c = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			sys[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dias[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			c[i] = 0;
		}
		for (int i = 0;i < n;i++)
		{
			if (90 <= sys[i] != 0 && sys[i] <= 140 && 60 <= dias[i] != 0 && dias[i] <= 90)
			{ //????????????
				m += 1;
				c[i] = m;
			}
			else
			{
				c[i] = 0;
				m = 0;
			}
		}
		m = c[0];
		for (int i = 1;i < n;i++)
		{ //?????????
			if (m < c[i])
			{
				m = c[i];
			}
		}
		System.out.print(m);
		return 0;
	}

}

