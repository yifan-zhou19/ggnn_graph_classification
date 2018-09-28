package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012730_2.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */

	public static int judge(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int same_year(int m1,int d1,int m2,int d2,int k)
	{
		int day = 0;
		int i;
		for (i = m1;i < m2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				day += 31;
			}
			if (i == 2)
			{
				day += 28 + k;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				day += 30;
			}
		}
		day = day - d1 + d2;
		return day;
	}

	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int k;
		int day = 0; //day???
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y1 == y2)
		{
			k = judge(y1);
			day = day + same_year(m1, d1, m2, d2, k);
		}
		if (y1 == y2 - 1)
		{
			k = judge(y1);
			day = day + same_year(m1, d1, 12, 31, k) + 1;
			k = judge(y1);
			day = day + same_year(1, 1, m2, d2, k);
		}
		if (y1 < y2 - 1)
		{
			k = judge(y1);
			day = day + same_year(m1, d1, 12, 31, k) + 1;
			k = judge(y2);
			day = day + same_year(1, 1, m2, d2, k);
			for (i = y1 + 1;i < y2;i++)
			{
				k = judge(i);
				day += 365 + k;
			}
		}
		System.out.print(day);
		return 0;
	}

}

