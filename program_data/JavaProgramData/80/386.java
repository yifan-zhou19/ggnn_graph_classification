package <missing>;

public class GlobalMembers
{
	/*
	 * qimokaoshi_3.cpp
	 *??:???????????
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */

	public static int year1;
	public static int year2;
	public static int month1;
	public static int month2;
	public static int day1;
	public static int day2;
	public static int d1;
	public static int d2 = 0;
	public static int i;
	public static int[] a = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int ntianshu(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
		   return 366;
		}
		return 365;
	}
	public static int tianshu(int y,int m,int d)
	{
		if (ntianshu(y) == 366)
		{
			a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		int day = 0;
		for (int i = 1;i <= m - 1;i++)
		{
			day = day + a[i];
		}
		return day + d;
	}
	public static int Main()
	{
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = tianshu(year1, month1, day1);
		for (i = year1;i <= year2 - 1;i++)
		{
			d2 = d2 + ntianshu(i);
		}
		d2 = d2 + tianshu(year2, month2, day2);
		System.out.print(d2 - d1);
	return 0;
	}

}

