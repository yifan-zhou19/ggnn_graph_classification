package <missing>;

public class GlobalMembers
{
	/*
	 * 5.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11294
	 */
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int s;
		if (y1 < y2)
		{
			s = 365 * (y2 - y1 - 1);
		for (i = y1 + 1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				s++;
			}
		}
		}
		else
		{
			s = 0;
		}
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (y1 == y2)
		{
			for (j = m1;j < m2;j++)
			{
				s = s + a[j];
			}
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				if (m1 <= 2 && m2>2)
				{
					s++;
				}
			}
			s = s + d2 - d1;
		}
		else
		{
			int left1;
			int passed2;
			left1 = 365;
			for (j = 1;j < m1;j++)
			{
				left1 = left1 - a[j];
			}
			left1 = left1 - d1;
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				if (m1 <= 2)
				{
					left1++;
				}
			}
			passed2 = 0;
			for (j = 1;j < m2;j++)
			{
				passed2 = passed2 + a[j];
			}
			passed2 = passed2 + d2;
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				if (2 < m2)
				{
					passed2++;
				}
			}
			s = s + left1 + passed2;
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

