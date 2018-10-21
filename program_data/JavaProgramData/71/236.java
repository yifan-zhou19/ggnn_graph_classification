package <missing>;

public class GlobalMembers
{
	/*
	 * month.cpp
	 *
	 *  Created on: 2010-12-25
	 *      Author: ???
	 *      Function: ???
	 */
	public static int[] day1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????????
	public static int[] day2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //???????
	public static int bissextile(int year)
	{ //???????????????1?????0
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int relative(int month1,int month2,int year)
	{
		int days = 0;
		if (bissextile(year) != 0) //??????????????????
		{
			for (int i = month1;i < month2;i++)
			{
				days = days + day2[i];
			}
		}
		else //???????????????????
		{
			for (int i = month1;i < month2;i++)
			{
				days = days + day1[i];
			}
		}
		if (days % 7 == 0)
		{
			return 1; //??????1?????0
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int relation;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 < month2)
			{
				relation = relative(month1, month2, year);
			}
			else if (month1 > month2)
			{
				relation = relative(month2, month1, year);
			}
			else
			{
				relation = 1;
			}
			if (relation != 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

