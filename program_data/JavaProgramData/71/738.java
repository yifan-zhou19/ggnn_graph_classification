package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-2
	 *      Author: 99003
	 */

	public static int luna(int year)
	{
		if (year % 400 == 0)
		{
			return 1;
		}
		if (year % 100 == 0)
		{
			return 0;
		}
		if (year % 4 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int year;
		int month1;
		int month2;
		int day;
		int n;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n >= 1;n--)
		{
			day = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon[2] = mon[2] + luna(year);
			if (month1 - month2 > 0)
			{
				for (;month2 < month1;month2++)
				{
					day = day + mon[month2];
				}
			}
			if (month1 - month2 < 0)
			{
						for (;month1 < month2;month1++)
						{
							day = day + mon[month1];
						}
			}
			if (day % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			mon[2] = 28;
		}
		return 0;
	}

}

