package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012889_3.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: ???
	 *        ??? ???
	 */



	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int month1;
		int month2;
		int day1 = 0;
		int day2 = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????????
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++,day1 = 0,day2 = 0)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year % 4 != 0 || (year % 400 != 0 && year % 100 == 0))
			{ //????
				for (j = 1;j < month1;j++) //?????????
				{
					day1 += a[j];
				}
				for (j = 1;j < month2;j++) //?????????
				{
					day2 += a[j];
				}
			}
			else
			{ //????
				for (j = 1;j < month1;j++) //?????????
				{
					day1 += b[j];
				}
				for (j = 1;j < month2;j++) //?????????
				{
					day2 += b[j];
				}
			}
			if ((day1 - day2) % 7 == 0) //????????
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

