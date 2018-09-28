package <missing>;

public class GlobalMembers
{
	/*
	 * exercise37.cpp
	 *
	 *  Created on: 2013-11-7
	 *      Author: st
	 */
	public static int Main()
	{
		int n;
		int i;
		int k;
		int year;
		int month1;
		int month2;
		int days = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int min;
		int max;
		for (i = 1;i <= n;i++)
		{
			 year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (month1 > month2)
			 {
				 max = month1;
				 min = month2;
			 }
			 else
			 {
				 max = month2;
			   min = month1;
			 }
			 if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			 {
				for (k = min;k < max;k++)
				{
				days += b[k];
				}
				if (days % 7 == 0)
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
			else
			{
				for (k = min;k < max;k++)
				{
				days += a[k];
				}
				if (days % 7 == 0)
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
			 days = 0;

		}



	}

}

