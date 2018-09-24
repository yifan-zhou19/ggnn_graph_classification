package <missing>;

public class GlobalMembers
{
	/*
	 * xingqiji.cpp
	 *
	 *  Created on: 2010-11-19
	 *      Author: Administrator
	 */
	public static int Main()
	{
		long year;
		int month;
		int day;
		int i;
		int num;
		year = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		long a;
		long b;
		long c;
		a = (long)(year - 1) / 4;
		b = (long)(year - 1) / 100;
		c = (long)(year - 1) / 400;
		num = a - b + c;
		long sum;
		sum = (year - 1) * 365 + num;
		int[] imonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 4 == 0)
		{
			if (year % 100 != 0)
			{
				imonth[1] = 29;
			}
			if (year % 400 == 0)
			{
				imonth[1] = 29;
			}
		}
		for (i = 0;i < month - 1;i++)
		{
			sum = sum + imonth[i];
		}
		sum = sum + day;
		long week;
		week = sum % 7;
		switch (week)
		{
		case 0:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 6:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		}
		return 0;
	}







}

