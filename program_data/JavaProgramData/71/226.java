package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: lenovo
	 */
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int year;
		int month1;
		int month2;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i <= n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int c;
			int d;
			d = (month1 > month2)?month1:month2;
			c = (month1 > month2)?month2:month1;

			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			{
				int sum = 0;
				for (int j = c;j < d;j++)
				{
					sum = sum + b[j];
				}
				if (sum % 7 == 0)
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
						int sum = 0;
						for (int j = c;j < d;j++)
						{
							sum = sum + a[j];
						}

						if (sum % 7 == 0)
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
		}
		return 0;
	}

}

