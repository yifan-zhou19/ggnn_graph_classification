package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 * ???1100012870;
	 * ???????
	 *  Created on: 2011-11-4
	 *      Author: Li Wenpeng
	 */
	public static int judge(int x)
	{
		if (x % 400 == 0)
		{
			return 1;
		}
		if (x % 100 == 0)
		{
			return 0;
		}
		if (x % 4 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		final int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int year2;
		int day1;
		int day2;
		int month1;
		int month2;
		int i;
		int ans = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year1 == year2)
		{
			for (i = month1;i < month2;i++)
			{
				ans = ans + a[i];
			}
			ans = ans + day2 - day1;
			System.out.print(ans);
			System.out.print("\n");
			return 0;
		}
		for (i = year1 + 1;i < year2;i++)
		{
			ans = ans + 365 + judge(i);
		}
		for (i = 1;i < month2;i++)
		{
			ans = ans + a[i];
			if (i == 2)
			{
				ans = ans + judge(year2);
			}
		}
		for (i = month1;i <= 12;i++)
		{
			ans = ans + a[i];
			if (i == 2)
			{
				ans = ans + judge(year1);
			}
		}
		ans = ans + day2 - day1;
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}

}

