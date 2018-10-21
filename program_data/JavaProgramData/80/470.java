package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */

	public static int ifrun(int year)
	{
		if (year % 4 != 0)
		{
			return 0;
		}
		else
		{
			if (year % 100 != 0)
			{
				return 1;
			}
			else
			{
				if (year % 400 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}
	public static int jisuan(int y, int m, int d)
	{
		if (m == 1)
		{
			return d;
		}
		else if (m == 2)
		{
			return 31 + d;
		}
		else if (m == 3)
		{
			return 31 + 28 + d + ifrun(y);
		}
		else if (m == 4)
		{
			return 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 5)
		{
			return 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 6)
		{
			return 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 7)
		{
			return 30 + 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 8)
		{
			return 31 + 30 + 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 9)
		{
			return 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 10)
		{
			return 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else if (m == 11)
		{
			return 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
		else
		{
			return 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + d + ifrun(y);
		}
	}
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		int sum = 0;
		for (int i = y1; i < y2; i++)
		{

			if (ifrun(i) == 1)
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		k = sum + jisuan(y2, m2, d2) - jisuan(y1, m1, d1);

		System.out.print(k);
		return 0;

	}

}

